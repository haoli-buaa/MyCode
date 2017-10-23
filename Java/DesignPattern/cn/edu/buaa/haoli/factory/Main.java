package cn.edu.buaa.haoli.factory;

public class Main {
	public static void main(String[] args){
		//�򵥹���ģʽ
		SimpleFactory factory = new SimpleFactory();
		Car mycar = factory.getBMW();
		mycar.drive();
		mycar = factory.getBenz();
		mycar.drive();
		//��������ģʽ
		FactoryMethod fm = new BMWFactory();
		mycar = fm.getCar();
		mycar.drive();
		//���󹤳�ģʽ
		GermanyFactory gf = new ConcreteGermanyFactory();
		mycar = gf.getBenz();
		mycar.drive();
		JapaneseFactory jf = new ConcreteJapaneseFactory();
		JCar urcar = jf.getToyota();
		urcar.drive();
	}
}
