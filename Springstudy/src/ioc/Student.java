package ioc;

public class Student {

	private String name;

	public Student() {
		System.out.println("Student对象被创建");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
