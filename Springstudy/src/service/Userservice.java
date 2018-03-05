package service;

public class Userservice {

	private String name;

	private Byeservice byeservice;
	
	
	public Byeservice getByeservice() {
		return byeservice;
	}

	public void setByeservice(Byeservice byeservice) {
		this.byeservice = byeservice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sayHello() {
		System.out.println("hello " +name);
		byeservice.saygoodbye();
	}
}
