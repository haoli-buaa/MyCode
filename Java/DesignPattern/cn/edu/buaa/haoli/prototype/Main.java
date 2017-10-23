package cn.edu.buaa.haoli.prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException{
		//浅度克隆
		Person p1 = new Person("张三",24);
		p1.setSchool(new School("清华"));
		Person p2 = p1.clone();
		System.out.println(p2.getSchool() == p1.getSchool());//true
		p2.setAge(25);
		p2.setName("李四");
		p2.getSchool().setName("北大");;	
		System.out.println(p1.getSchool().getName());		
		System.out.println(p2.getSchool().getName());
		//深度克隆
		PersonDeep p3 = new PersonDeep("Ed Sheeran", 25);
		p3.setSchool(new School("UCLA"));
		PersonDeep p4 = p3.clone();
		System.out.println(p3.getSchool() == p4.getSchool());//false
	}
}
