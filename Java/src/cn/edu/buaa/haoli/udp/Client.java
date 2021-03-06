package cn.edu.buaa.haoli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Client {
	// UDP client
	// 向服务器发送数据
	//若收到回执则显示
	private final static int SERVER_MAX_BUF = 4;
	private final static InetSocketAddress SERVER_ADDR = new InetSocketAddress("localhost", 9000);
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
						SERVER_ADDR);
				// 发送数据
				ds.send(dp);
				offset += SERVER_MAX_BUF;
				//防止出数据是BUFFER容量整数倍时，在接收回执处阻塞
				if(offset == data.length){
					byte[] tmp = new String("\b").getBytes();
					ds.send(new DatagramPacket(tmp,0,tmp.length,SERVER_ADDR));
				}
			}
			//检查是否收到回执
			//创建接收缓存,若客户端发送的包大于缓存区大小，则会造成数据丢失
			while(true){
				byte[] buffer = new byte[SERVER_MAX_BUF];
				// 打包数据
				DatagramPacket dp = new DatagramPacket(buffer, 0, buffer.length);
				// 读取分析数据
				ds.receive(dp);
				if (dp.getLength() > 0) {
					System.out.print(new String(dp.getData(), 0, dp.getLength()));
					if (dp.getLength() != SERVER_MAX_BUF) {
						System.out.println();// 换行以正确显示
						break;
					}
				}
				else{
					break;
				}
			}
		}				
		//释放资源
		sc.close();
		ds.close();
	}
}
