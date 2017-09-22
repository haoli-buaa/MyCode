package cn.edu.buaa.haoli.decorator;
/*装饰器模式
 * 角色：具体Component
 * */
public class ConcreteComponent implements Component {

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		System.out.println("执行原有的功能");
	}
}
