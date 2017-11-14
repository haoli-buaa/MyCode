package cn.edu.buaa.haoli.mediator;

/**
 * @author li
 *
 */
public class Development implements Department{

	private Mediator mediator;
	public Development(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("coding...");
		
	}

	@Override
	public void outAction() {
		System.out.println("经费不足，请求支援");
		mediator.command("financial");
	}

}
