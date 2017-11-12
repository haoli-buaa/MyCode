package cn.edu.buaa.haoli.observer;


/**
 * @author li
 *
 */
public class Coordinate {

	private int x;
	private int y;
	
	public Coordinate(){
		this(0, 0);
	}
	public Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "[x:" + x + ", y:" + y + "]";
	}
	@Override
	public int hashCode(){
		return toString().hashCode();
	}
	@Override
	public boolean equals(Object other){
		if(other == null)
			return false;
		return this.hashCode() == ((Coordinate)other).hashCode();
	}
	
}
