package cn.edu.buaa.haoli.prototype;
/*原型模式
 * 作用：复制对象
 * 特点：1。需要实现Cloneable接口。2.需要将clone方法重写为public
 * 浅度克隆，只复制基本数据类型和String类型，数组、对象、引用等仍指向原对象中的地址；
 * */
public class Person implements Cloneable{
	private String name;
	private int age;
	private School school;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Person clone() throws CloneNotSupportedException{
		return (Person) super.clone();
	}
	
}
