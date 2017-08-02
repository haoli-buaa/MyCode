package cn.edu.buaa.haoli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
	//UDP server
	//接受并显示客户端发送的数据
	private final static int BUF_SIZE = 4;
	public static void main(String[] args) throws IOException{
		//创建服务器，端口设置为：9000
		DatagramSocket ds = new DatagramSocket(9000);
		while(true){
			//创建接收缓存,若客户端发送的包大于缓存区大小，则会造成数据丢失
			byte[] buffer = new byte[BUF_SIZE];
			//打包数据
			DatagramPacket dp = new DatagramPacket(buffer,0,buffer.length);
			//读取分析数据
			ds.receive(dp);
			if(dp.getLength() > 0){
				System.out.print(new String(dp.getData(), 0, dp.getLength()));
				if(dp.getLength() != BUF_SIZE)
					System.out.println();//换行以正确显示
			}
		}
	}	
}
