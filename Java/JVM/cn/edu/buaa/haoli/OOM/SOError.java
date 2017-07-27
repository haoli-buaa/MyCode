package cn.edu.buaa.haoli.OOM;

public class SOError {
	private int length = 1;
	void stackLeak(){
		length ++;
		stackLeak();
	}
	public static void main(String[] args){
		//vm args: -Xss64k
		SOError soe = new SOError();
		try{
			soe.stackLeak();
		}
		catch(Throwable e){
			System.out.println(soe.length);
			throw e;
		}
	}
}
