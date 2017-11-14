package cn.edu.buaa.haoli.mediator;

/**
 * @author li
 *
 */
public class Application {
	public static void main(String[] args) {
		Manager m = new Manager();
		Development d = new Development(m);
		Financial f = new Financial(m);
		d.outAction();
	}

}
