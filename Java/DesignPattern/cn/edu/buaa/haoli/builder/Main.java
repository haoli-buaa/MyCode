package cn.edu.buaa.haoli.builder;

public class Main {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.printf("商品名称:%s\n", product.getPart1());
		System.out.printf("商品价格:%s\n", product.getPart2());
	}

}
