package cn.edu.buaa.haoli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	//UDP server
	//接受并显示客户端发送的数据
	private final static int BUF_SIZE = 4;
	public static void main(String[] args) throws IOException{
		//创建服务器，端口设置为：9000
		DatagramSocket ds = new DatagramSocket(9000);
		//创建接收缓存,若客户端发送的包大于缓存区大小，则会造成数据丢失
		byte[] buffer = new byte[BUF_SIZE];
		//打包数据
		DatagramPacket dp = new DatagramPacket(buffer,0,buffer.length);
		while(true){			
			//读取分析数据
			ds.receive(dp);
			if(dp.getLength() > 0){
				String tmp = new String(dp.getData(), 0, dp.getLength());
				if(!tmp.equals("\b"))
					System.out.print(tmp);
				if(dp.getLength() != BUF_SIZE){
					System.out.println();//换行以正确显示
					//发送回执给client,在client端保证句子结束时不是BUF_SIZE的整数倍。
					//case:当客户端发送“abcd”时，刚好是4的整数倍，不会换行，也不会发送回执，client阻塞在receive方法等待回执
					//若大于服务器BUFFER容量，拆分
					int offset = 0;
					byte[] receipt = new String("Message received by server.").getBytes();
					while(offset < receipt.length){
						// 打包数据
						DatagramPacket rp = new DatagramPacket(receipt, offset, Math.min(BUF_SIZE, receipt.length-offset),
								dp.getSocketAddress());
						// 发送数据
						ds.send(rp);
						offset += BUF_SIZE;
					}					
				}
			}
		}
	}	
}
