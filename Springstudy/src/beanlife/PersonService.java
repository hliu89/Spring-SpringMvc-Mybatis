package beanlife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonService implements InitializingBean,DisposableBean{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sayhi() {
		System.out.println("Hi "+name);
	}

	public void init() {
		System.out.println("My init function");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
