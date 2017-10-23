package cn.edu.buaa.haoli.builder;
/**
 * Director�ǽ�����ģʽ�е�ָ���࣬
 * ����������˲�Ʒ���幹���㷨�������˲�Ʒ���������й̶�������
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
