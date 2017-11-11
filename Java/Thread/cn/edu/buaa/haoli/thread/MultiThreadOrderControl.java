package cn.edu.buaa.haoli.thread;

public class MultiThreadOrderControl {

	
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		C c = new C();
		//join 方法启动以后，会等待调用线程死亡后在执行其他线程
		a.start();
		a.join();
		b.start();
		b.join();
		c.start();		
		c.join();
	}

}
class A extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 5; i++)
			System.out.print("A");
	}	
}
class B extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 5; i++)
			System.out.print("B");
	}	
}
class C extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 5; i++)
			System.out.print("C");
	}	
}
