package cn.edu.buaa.haoli.factory;

/*���󹤳�ģʽ
 * ������ϵ����ľ��幤����
 * */
public class ConcreteJapaneseFactory implements JapaneseFactory{

	@Override
	public JCar getToyota() {
		// TODO Auto-generated method stub
		return new Toyota();
	}

	@Override
	public JCar getSparu() {
		// TODO Auto-generated method stub
		return new Sparu();
	}

}
