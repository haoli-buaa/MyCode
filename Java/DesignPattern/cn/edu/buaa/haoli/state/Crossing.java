package cn.edu.buaa.haoli.state;

/**
 * @author li
 *
 */
public class Crossing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new Red());
		context.setState(new Green());

	}

}
