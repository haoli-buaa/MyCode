package cn.edu.buaa.haoli.decorator;
/*装饰器模式
 * 作用： 除了添加子类以外，对类功能进行拓展
 * 可嵌套
 * */
public class ConcreteDecoratorA extends Decorator{

	private Component component;
	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		component.sampleOperation();
		System.out.println("执行增强的功能");
	}
	
}
