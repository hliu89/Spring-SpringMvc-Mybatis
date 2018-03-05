package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("autowire/beans.xml");
		Master m=(Master) ac.getBean("master");
		System.out.println(m.getName()+"  "+m.getDog().getName());
	}

}
