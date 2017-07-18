package Thread;

public class PostGraduate extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 20; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Read Paper and Do Experiments");
		}
	}	
}
