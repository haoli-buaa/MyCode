package cn.edu.buaa.haoli.observer;

import java.util.Observable;
import java.util.Observer;


/**
 * @author li
 *
 */
public class DemoObserver implements Observer{
	
	private Coordinate coordinate;	
	private Observable subject;
	
	public DemoObserver(Observable subject){
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		setCoordinate((Coordinate)arg);
		printCoordinate();
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public void printCoordinate() {
		System.out.println(coordinate.toString());
	}

}
