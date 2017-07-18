package Thread;

public class Web12306 implements Runnable{
	int total = 50;
	boolean flag = true;
	@Override
	public void run() {		
		while(flag){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test();	
		}
	}
	public synchronized void test(){		
		if(total == 0){
			flag = false;
			return;
		}		
		System.out.printf("恭喜%s抢票成功，剩余票数：%d\n",Thread.currentThread().getName(),--total);		
	}
}
