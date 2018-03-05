package inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("inter/beans.xml");
		ChangeLetter changeletter=(ChangeLetter) ac.getBean("changeLetter");
		System.out.println(changeletter.change());
	}

}
