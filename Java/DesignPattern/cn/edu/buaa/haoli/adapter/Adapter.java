package cn.edu.buaa.haoli.adapter;
/*������ģʽ
 * ���ͣ���������ģʽ
 * ��ɫ��������
 * */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.specificRequest();
		System.out.println("��Ҫһ�����ײ���,��ת��");		
	} 

}
