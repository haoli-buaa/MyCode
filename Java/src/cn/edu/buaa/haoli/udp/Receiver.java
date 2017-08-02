package cn.edu.buaa.haoli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver implements Runnable {
	public final static int MAX_BUFFER = 1024;
	private DatagramSocket dsocket;
	public Receiver(DatagramSocket ds){
		this.dsocket = ds;
	}
	@Override
	public void run() {		
		try {
			while (true) {
				//创建接收缓存
				byte[] buffer = new byte[MAX_BUFFER];
				//打包
				DatagramPacket p = new DatagramPacket(buffer, 0, MAX_BUFFER);
				// 接收
				dsocket.receive(p);
				// 解析并输出
				byte[] data = p.getData();
				String words = new String(data, 0, data.length);
				System.out.println(words);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
