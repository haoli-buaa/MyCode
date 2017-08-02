package cn.edu.buaa.haoli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Sender implements Runnable{
	private DatagramSocket dsocket;
	private InetSocketAddress remote;
	private String username;
	public Sender(DatagramSocket ds, InetSocketAddress rm, String name){
		this.dsocket = ds;
		this.remote = rm;
		this.username = name;
	}
	@Override
	public void run() {
		System.out.println("Double click \"Enter\" to exit speaking.");
		//交互式获取数据
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd:\t");
			String tmp = sc.nextLine();
			if(tmp.length() == 0)
				break;
			tmp = username + " in " + df.format(System.currentTimeMillis()) + tmp;
			byte[] data = tmp.getBytes();
			//打包,假设接收方buffer足够大
			DatagramPacket p = new DatagramPacket(data, 0, data.length, remote);
			//发送
			try {
				dsocket.send(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//释放资源
		sc.close();
		//不关闭ds，因为Receiver可能仍在工作
	}
}
