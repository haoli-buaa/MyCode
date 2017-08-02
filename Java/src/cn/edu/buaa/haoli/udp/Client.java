package cn.edu.buaa.haoli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
	// UDP client
	// 向服务器发送数据
	private final static int SERVER_MAX_BUF = 4;
	public static void main(String[] args) throws IOException {
		// 创建客户端，端口设置为：9001
		DatagramSocket ds = new DatagramSocket(9001);
		// 准备数据：交互式
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \"\\:q\" to exit");
		while (sc.hasNext()) {
			String msg = sc.nextLine();
			if(msg.equals("\\:q"))
				break;
			byte[] data = msg.getBytes();
			//若大于服务器BUFFER容量，拆分
			int offset = 0;
			while(offset < data.length){
				// 打包数据
				DatagramPacket dp = new DatagramPacket(data, offset, Math.min(SERVER_MAX_BUF, data.length-offset),
						new InetSocketAddress("localhost", 9000));
				// 发送数据
				ds.send(dp);
				offset += SERVER_MAX_BUF;
			}			
		}				
		//释放资源
		ds.close();
	}
}
