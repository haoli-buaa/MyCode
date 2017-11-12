package cn.edu.buaa.haoli.adapter;

/**
 * @author li
 *
 */
public class Client {
	public static void main(String[] args) {		
		//继承
		Target tar = new Adapter();
		tar.request();
		//组合
		Adaptee adat = new Adaptee();
		Target target = new AdapterObject(adat);
		target.request();
	}
}
