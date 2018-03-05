package beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("beanlife/beans.xml");
		PersonService personservice=(PersonService) ac.getBean("personService");
		personservice.sayhi();
	}

}
