package cn.edu.buaa.haoli.factory;

/*抽象工厂模式
 * 处理日系车族的具体工厂类
 * */
public class ConcreteJapaneseFactory implements JapaneseFactory{

	@Override
	public JCar getToyota() {
		// TODO Auto-generated method stub
		return new Toyota();
	}

	@Override
	public JCar getSparu() {
		// TODO Auto-generated method stub
		return new Sparu();
	}

}
