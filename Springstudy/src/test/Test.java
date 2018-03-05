package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Util.applicationutil;
import service.Byeservice;
import service.Userservice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Userservice us=(Userservice) ac.getBean("userService");
//		Byeservice bs=(Byeservice) ac.getBean("byeService");
//		us.sayHello();
//		bs.saygoodbye();
		((Userservice)applicationutil.getApplicationContext().getBean("userService")).sayHello();
	}

}
