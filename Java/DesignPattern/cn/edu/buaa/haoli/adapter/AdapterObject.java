package cn.edu.buaa.haoli.adapter;
/*������ģʽ
 * ���ͣ�����������ģʽ
 * �ص㣺��Ϲ�ϵ
 * */
public class AdapterObject implements Target{
	private Adaptee adaptee;
	public AdapterObject(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void request() {
		adaptee.specificRequest();
		System.out.println("��Ҫһ�����ײ�������ת��");
		
	};	
}
