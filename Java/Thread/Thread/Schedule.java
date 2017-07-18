package Thread;

import java.util.*;

public class Schedule {
	public static void main(String[] args){
		Timer t = new Timer();
		t.schedule(new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Wow, I'm sorry to hear that...");
			}
			
		}, new Date(System.currentTimeMillis()+1000),1000);
	}
}
