package cn.edu.buaa.haoli.mediator;

import java.util.HashMap;
import java.util.Map;


/**
 * @author li
 *
 */
public class Manager implements Mediator {

	Map<String, Department> map = new HashMap<String, Department>();

	@Override
	public void register(String name, Department department) {
		map.put(name, department);		
	}

	@Override
	public void command(String message) {
		map.get(message).selfAction();		
	}

}
