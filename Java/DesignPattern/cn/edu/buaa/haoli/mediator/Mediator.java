package cn.edu.buaa.haoli.mediator;


/**
 * @author li
 *
 */
public interface Mediator {

	public void register(String name, Department department);
	public void command(String message);

}
