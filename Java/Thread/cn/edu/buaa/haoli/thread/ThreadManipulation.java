package cn.edu.buaa.haoli.thread;

public class ThreadManipulation {
	public static void main(String[] args){
		Web12306 user = new Web12306();
		Thread p1 = new Thread(user,"刘备");
		Thread p2 = new Thread(user,"赤兔马");
		Thread p3 = new Thread(user,"黄牛1号");
		Thread p4 = new Thread(user,"手机用户183****7990");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p4.setPriority(10);
	}
}

