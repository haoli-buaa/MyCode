package cn.edu.buaa.haoli.factory;
/*抽象工厂模式
 * 处理德系车族的具体工厂类
 * */

public class ConcreteGermanyFactory implements GermanyFactory {

	@Override
	public Car getBMW() {
		// TODO Auto-generated method stub
		return new BMW();
	}

	@Override
	public Car getBenz() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
