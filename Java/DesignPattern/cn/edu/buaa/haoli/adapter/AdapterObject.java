package cn.edu.buaa.haoli.adapter;

/**
 * @author li
 *组合实现适配器模式
 */
public class AdapterObject implements Target{
	private Adaptee adaptee;
	public AdapterObject(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void request() {
		adaptee.specificRequest();
		System.out.println("以组合模式转换为三孔插座");
		
	};	
}
