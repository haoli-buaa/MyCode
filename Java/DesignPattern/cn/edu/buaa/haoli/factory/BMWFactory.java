package cn.edu.buaa.haoli.factory;
/**
 * ������ʽ�����еľ��幤���࣬ÿ�������Ʒ����Ӧ��һ�����幤����
 * */
public class BMWFactory implements FactoryMethod{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}
	
}
