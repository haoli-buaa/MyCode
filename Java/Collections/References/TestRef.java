package References;

import java.lang.ref.WeakReference;

public class TestRef {
	public static void main(String[] args){
		//String str = "abc";
		String str = new String("abc");
		WeakReference<String> wr = new WeakReference(str);
		System.out.println(wr.get());
		str = null;
		System.gc();
		System.runFinalization();
		System.out.println(wr.get());
	}
}
