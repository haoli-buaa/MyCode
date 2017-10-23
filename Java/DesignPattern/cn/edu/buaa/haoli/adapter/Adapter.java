package cn.edu.buaa.haoli.adapter;
/*适配器模式
 * 类型：类适配器模式
 * 角色：适配器
 * */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.specificRequest();
		System.out.println("需要一个三孔插座,已转换");		
	} 

}
