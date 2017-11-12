package cn.edu.buaa.haoli.adapter;

/**
 * @author li
 *适配器类，继承adaptee类，实现目标接口
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.specificRequest();
		System.out.println("转换为三孔插座");		
	} 

}
