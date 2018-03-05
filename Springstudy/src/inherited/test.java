package inherited;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("inherited/beans.xml");
		Degree d=(Degree) ac.getBean("degree");
		System.out.println("name "+d.getName()+" age "+d.getAge()+" degree "+d.getDegree());
		
	}

}
