package cn.edu.buaa.haoli.observer;

import java.util.Observable;


/**
 * @author li
 *
 */
public class DemoSubject extends Observable{

	private Coordinate coordinate;
	public void updateCoordinate(Coordinate coordinate) {
		if(!coordinate.equals(this.coordinate)) {
			setChanged();
			notifyObservers(coordinate);
			this.coordinate = coordinate;
		}
	}

}
