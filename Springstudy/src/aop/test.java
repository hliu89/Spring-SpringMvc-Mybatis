package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("aop/beans.xml");
		TestserviceInter t=(TestserviceInter) ac.getBean("proxyFactoryBean");
		t.sayhello();
		TestserviceInter2 ts=(TestserviceInter2) t;
		ts.saybye();
	}

}
