package cn.edu.buaa.haoli.factory;
/*抽象工厂模式，一个产品族（多个具体产品）对应一个工厂
 * */
public interface GermanyFactory {
	public Car getBMW();
	public Car getBenz();
}
