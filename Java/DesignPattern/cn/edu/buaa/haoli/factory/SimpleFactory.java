package cn.edu.buaa.haoli.factory;
/*�򵥹���ģʽ�еĹ�����
 * ��Ҫ�������о��в�Ʒ��ʵ��
 * ��ȫ���ࡱ���ϵ��ࡱ
 * �ŵ㣺ʵ�ּ�
 * ȱ�㣺���Ӿ����Ʒ����ʱ����Ҫ�Թ���������޸ģ������Ͽ���ԭ��
 * */
public class SimpleFactory {
	public BMW getBMW(){
		return new BMW();
	}
	public Benz getBenz(){
		return new Benz();
	}
	
}
