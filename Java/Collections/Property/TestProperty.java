package Property;

import java.io.*;
import java.util.Properties;

public class TestProperty {
	public static void main(String[] args) throws IOException{
		Properties pro = new Properties();
		/*pro.setProperty("age", "23");
		pro.setProperty("name", "Li");
		System.out.println(pro.getProperty("name"));
		pro.store(new FileWriter("config.properties"), "personal info");*/
		
		InputStream path = TestProperty.class.getResourceAsStream("config.properties");
		pro.load(path);
		System.out.println(pro.getProperty("age"));
	}
}
