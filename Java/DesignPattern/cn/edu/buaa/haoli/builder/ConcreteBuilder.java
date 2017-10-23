package cn.edu.buaa.haoli.builder;
/**
 * 建造者模式中的具体建造者类
 * 具体实现了建造者中的方法
 **/
public class ConcreteBuilder implements Builder{
	private Product product = new Product();
	@Override
	public void buildPart1(){
		String name = "百岁山";
		product.setPart1(name);
	}
	@Override
	public void buildPart2(){
		String price = "3元";
		product.setPart2(price);
	}@Override
	public Product retrieveResult(){
		return product;
	}
}
