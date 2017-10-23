package cn.edu.buaa.haoli.adapter;
/*适配器模式
 * 类型：对象适配器模式
 * 特点：组合关系
 * */
public class AdapterObject implements Target{
	private Adaptee adaptee;
	public AdapterObject(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void request() {
		adaptee.specificRequest();
		System.out.println("需要一个三孔插座，已转换");
		
	};	
}
