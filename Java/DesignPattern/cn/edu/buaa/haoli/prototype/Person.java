package cn.edu.buaa.haoli.prototype;
/*ԭ��ģʽ
 * ���ã����ƶ���
 * �ص㣺1����Ҫʵ��Cloneable�ӿڡ�2.��Ҫ��clone������дΪpublic
 * ǳ�ȿ�¡��ֻ���ƻ����������ͺ�String���ͣ����顢�������õ���ָ��ԭ�����еĵ�ַ��
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
