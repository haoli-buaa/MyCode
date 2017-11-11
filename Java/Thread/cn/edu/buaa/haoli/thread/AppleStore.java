package cn.edu.buaa.haoli.thread;

public class AppleStore {
	static int MAX_REPOSITORY = 5;
	int value = 0;
	public synchronized void sell(){
		if(value <= 0)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.printf("销售成功，库存：%d\n",--value);
		this.notify();
	}
	public synchronized void produce(){
		if(value == MAX_REPOSITORY)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.printf("生产成功，库存：%d\n",++value);
		this.notify();
	}
	public static void main(String[] args){
		AppleStore mine = new AppleStore();
		Seller a = new Seller(mine);
		Customer b = new Customer(mine);
		new Thread(a).start();
		new Thread(b).start();
	}
}
class Seller implements Runnable{
	AppleStore as = null;
	public Seller(AppleStore as){
		this.as = as;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			as.sell();
		}
	}	
}
class Customer implements Runnable{
	AppleStore as = null;
	public Customer(AppleStore as){
		this.as = as;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			as.produce();
		}
	}	
}