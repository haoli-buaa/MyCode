package cn.edu.buaa.haoli.adapter;

public class Client {
	public static void main(String[] args) {		
		//类适配器模式
		Target tar = new Adapter();
		tar.request();
		//对象适配器模式
		Adaptee adat = new Adaptee();
		Target target = new AdapterObject(adat);
		target.request();
	}
}
