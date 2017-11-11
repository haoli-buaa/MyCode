package cn.edu.buaa.haoli.thread;

public class TestThread {
	public static void main(String[] args) throws InterruptedException{
		Web12306 user = new Web12306();
		Thread proxy1 = new Thread(user,"黄牛1号");
		Thread proxy2 = new Thread(user,"董卓");
		Thread proxy3 = new Thread(user,"吕布");
		proxy1.start();
		proxy2.start();
		proxy3.start();
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		PostGraduate me = new PostGraduate();
		me.start();
		for(int i = 0; i < 20; i++){
			Thread.sleep(1000);
			me.setPriority(Thread.MAX_PRIORITY);
			System.out.println("Play for a while");
		}
		
	
	}
}
