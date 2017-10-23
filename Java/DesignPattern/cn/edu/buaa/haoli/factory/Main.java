package cn.edu.buaa.haoli.factory;

public class Main {
	public static void main(String[] args){
		//简单工厂模式
		SimpleFactory factory = new SimpleFactory();
		Car mycar = factory.getBMW();
		mycar.drive();
		mycar = factory.getBenz();
		mycar.drive();
		//工厂方法模式
		FactoryMethod fm = new BMWFactory();
		mycar = fm.getCar();
		mycar.drive();
		//抽象工厂模式
		GermanyFactory gf = new ConcreteGermanyFactory();
		mycar = gf.getBenz();
		mycar.drive();
		JapaneseFactory jf = new ConcreteJapaneseFactory();
		JCar urcar = jf.getToyota();
		urcar.drive();
	}
}
