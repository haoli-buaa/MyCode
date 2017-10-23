package cn.edu.buaa.haoli.factory;

/**
 * 工厂方式方法中的具体工厂类，每个具体产品都对应有一个具体工厂类
 * */
public class BenzFactory implements FactoryMethod{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}
	
}