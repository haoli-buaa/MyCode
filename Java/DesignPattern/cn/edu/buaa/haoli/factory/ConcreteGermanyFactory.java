package cn.edu.buaa.haoli.factory;
/*���󹤳�ģʽ
 * �����ϵ����ľ��幤����
 * */

public class ConcreteGermanyFactory implements GermanyFactory {

	@Override
	public Car getBMW() {
		// TODO Auto-generated method stub
		return new BMW();
	}

	@Override
	public Car getBenz() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
