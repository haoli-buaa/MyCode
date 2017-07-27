package cn.edu.buaa.haoli.OOM;

import java.util.ArrayList;

public class HeapOOM {
	static class OOMobject{
		
	}
	public static void main(String[] args){
		//vm args:-Xms20m -xmx20m -XX:+HeapDumpOnOutOfMemoryError
		ArrayList<OOMobject> list = new ArrayList<OOMobject>();
		while(true){
			list.add(new OOMobject());
		}
	}
}
