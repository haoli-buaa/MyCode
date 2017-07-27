package cn.buaa.edu.haoli.gcma;

public class ReferenceCountingGC {
	public Object instance = null;
	public static void main(String[] args){
		//-XX:+PrintGCDetails -XX:+PrintHeapAtGC
		ReferenceCountingGC a = new ReferenceCountingGC();
		ReferenceCountingGC b = new ReferenceCountingGC();
		a.instance = b;
		b.instance = a;
		a = null;
		b = null;
		//java没有采用引用计数法来进行GC，这种方法无法解决循环引用
		System.gc();
	}
}
