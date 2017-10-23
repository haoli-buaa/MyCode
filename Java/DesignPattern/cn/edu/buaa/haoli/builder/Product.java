package cn.edu.buaa.haoli.builder;
/*建造者模式中德产品类
 * 产品较为复杂，由多个组件构成；
 * */
public class Product {
	private String part1;
	private String part2;
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public String getPart2() {
		return part2;
	}
	public void setPart2(String part2) {
		this.part2 = part2;
	} 
}
