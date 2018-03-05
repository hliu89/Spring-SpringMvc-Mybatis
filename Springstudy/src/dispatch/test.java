package dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("dispatch/beans.xml");
		 DButil emp=(DButil) ac.getBean("dbutil2");
		System.out.println(emp.getName()+" "+emp.getDrivername());
	}

}
