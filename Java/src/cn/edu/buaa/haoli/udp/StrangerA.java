package cn.edu.buaa.haoli.udp;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class StrangerA {
	public static int PORT = 8888;
	public static InetSocketAddress REMOTE = new InetSocketAddress("localhost", 9999);
	//建立一个udp聊天工具
	//A和B可以对话
	//使用两个线程，一个用于接收，一个用于发送
	public static void main(String[] args) throws SocketException{
		System.out.println("Hello, A. You can start chat now.");
		DatagramSocket ds = new DatagramSocket(PORT);
		Sender sender = new Sender(ds, REMOTE, "A");
		Receiver receiver = new Receiver(ds);
		Thread s = new Thread(sender);
		Thread r = new Thread(receiver);
		s.start();
		r.start();
	}
}
