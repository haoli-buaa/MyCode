package cn.edu.buaa.haoli.thread;
/**
 * 单例模式：懒汉式+double checking
 * @author li
 */
public class MySingleton{
	private static MySingleton instance = null;
	private MySingleton(){
		
	}
	public static MySingleton getInstance(){
		if(null == instance){
			synchronized(MySingleton.class){
				if(null == instance)
					instance = new MySingleton();
			}
		}
		return instance;
	}	
}
/**
 * 单例模式：饿汉式 + 内部类*
 * Runtime使用了饿汉式单例设计模式
 */
class MySingle{
	private static class InnerMS{
		private static MySingle single = new MySingle();
	}
	private MySingle(){
		;
	}
	public static MySingle getInstance(){
		return InnerMS.single;
	}
}
