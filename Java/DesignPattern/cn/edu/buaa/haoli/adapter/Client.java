package cn.edu.buaa.haoli.adapter;

public class Client {
	public static void main(String[] args) {		
		//��������ģʽ
		Target tar = new Adapter();
		tar.request();
		//����������ģʽ
		Adaptee adat = new Adaptee();
		Target target = new AdapterObject(adat);
		target.request();
	}
}
