package cn.edu.buaa.haoli.builder;
/*建造者模式中的建造者类
 * 是一个抽象接口，可以有不同的具体实现
 *方法包括部件构造方法，产品由几个部件组成，建造者就有几个部件构造方法
 *还有返回产品的方法
 * */
public interface Builder {
	public void buildPart1();
	public void buildPart2();
	public Product retrieveResult();
}
