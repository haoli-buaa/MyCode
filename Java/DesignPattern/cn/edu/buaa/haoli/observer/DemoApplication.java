package cn.edu.buaa.haoli.observer;

import java.util.Observer;


/**
 * @author li
 *
 */
public class DemoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoSubject subject = new DemoSubject();
		Observer a = new DemoObserver(subject);
		Observer b = new DemoObserver(subject);
		Observer c = new DemoObserver(subject);
		
		subject.updateCoordinate(new Coordinate(100,100));
		subject.updateCoordinate(new Coordinate(700,700));
		subject.updateCoordinate(new Coordinate(700,700));
	}

}
