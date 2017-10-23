package cn.edu.buaa.haoli.builder;

public class Main {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.printf("��Ʒ����:%s\n", product.getPart1());
		System.out.printf("��Ʒ�۸�:%s\n", product.getPart2());
	}

}
