package cn.edu.buaa.haoli.factory;
/*简单工厂模式中的工厂类
 * 需要包含所有具有产品的实现
 * “全能类”“上帝类”
 * 优点：实现简单
 * 缺点：增加具体产品种类时，需要对工厂类加以修改，不符合开闭原则
 * */
public class SimpleFactory {
	public BMW getBMW(){
		return new BMW();
	}
	public Benz getBenz(){
		return new Benz();
	}
	
}
