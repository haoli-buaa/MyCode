package cn.edu.buaa.haoli.state;

/**
 * @author li
 *
 */
public class Red implements State{

	@Override
	public void handle() {
		System.out.println("The traffic light is red now. No trepassing!");
		
	}

}
