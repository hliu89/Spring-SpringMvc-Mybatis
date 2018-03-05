package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("constructor/beans.xml");
		Employee emp=(Employee) ac.getBean("employee");
		System.out.println(emp.getName());
	}

}
