package cn.edu.buaa.haoli.builder;
/**
 * Director是建造者模式中的指导类，
 * 这个类体现了产品整体构建算法，体现了产品生产过程中固定的流程
 * */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
