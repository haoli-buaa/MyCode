package cn.edu.buaa.haoli.prototype;

public class PersonDeep implements Cloneable{
	private String name;
	private int age;
	private School school;
	public PersonDeep(String name, int age){
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
	public PersonDeep clone() throws CloneNotSupportedException{
		PersonDeep person = (PersonDeep)super.clone();
		if(this.school != null){
			School scho = new School(school.getName());
			person.setSchool(scho);
		}
		return person;
	}
}
