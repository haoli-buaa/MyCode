package cn.edu.buaa.haoli.factory;

/*
 * 抽象产品族中日系车族的具体实现 丰田**/
public class Toyota implements JCar{

	@Override
	public void drive() {
		System.out.println("I'm driving Toyota");		
	}

}
