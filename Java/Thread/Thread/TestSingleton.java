package Thread;

public class TestSingleton implements Runnable{

	@Override
	public void run() {
		MySingleton ms = MySingleton.getInstance();
		System.out.println(ms);		
	}
	
	public static void main(String[] args){
		TestSingleton ts = new TestSingleton();
		Thread t1 = new Thread(ts,"Thread1");
		Thread t2 = new Thread(ts, "Thread2");
		t1.start();
		t2.start();
	}
	
}
