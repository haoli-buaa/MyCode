package cn.edu.buaa.haoli.builder;
/**
 * ������ģʽ�еľ��彨������
 * ����ʵ���˽������еķ���
 **/
public class ConcreteBuilder implements Builder{
	private Product product = new Product();
	@Override
	public void buildPart1(){
		String name = "����ɽ";
		product.setPart1(name);
	}
	@Override
	public void buildPart2(){
		String price = "3Ԫ";
		product.setPart2(price);
	}@Override
	public Product retrieveResult(){
		return product;
	}
}
