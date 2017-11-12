package cn.edu.buaa.haoli.state;

public class Context {

	private State state;
	public void setState(State state){
		this.state = state;
		state.handle();
	}

}
