package cn.edu.buaa.haoli.decorator;

public abstract class Decorator implements Component{
	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public abstract void sampleOperation();
	
}
