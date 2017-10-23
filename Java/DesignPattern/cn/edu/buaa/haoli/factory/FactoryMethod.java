package cn.edu.buaa.haoli.factory;
/*工厂方法模式中的抽象工厂类
 * 优点：符合了开闭原则
 * 缺点：当产品种类很多时，对应的具体工厂类也一一存在内存中，造成空间浪费*/

public interface FactoryMethod {
	public Car getCar();
}
