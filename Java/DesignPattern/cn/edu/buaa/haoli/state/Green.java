package cn.edu.buaa.haoli.state;

/**
 * @author li
 *
 */
public class Green implements State{

	@Override
	public void handle() {
		System.out.println("The traffic light is green now. Pass!");
		
	}

}
