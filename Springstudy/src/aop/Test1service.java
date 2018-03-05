package aop;

public class Test1service implements TestserviceInter,TestserviceInter2{

	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayhello() {
		// TODO Auto-generated method stub
		System.out.println("Hello "+name);
	}

	@Override
	public void saybye() {
		// TODO Auto-generated method stub
		System.out.println("Bye "+name);
	}

}
