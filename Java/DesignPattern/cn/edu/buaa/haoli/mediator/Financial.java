package cn.edu.buaa.haoli.mediator;

public class Financial implements Department{
	private Mediator mediator;
	public Financial(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("financial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("发钱");
		
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		
	}

}
