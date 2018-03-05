package Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("Collection/beans.xml");
		Department dp=(Department) ac.getBean("department");
		System.out.println(dp.getName());
		for(String r:dp.getEmpname()) {
			System.out.println(r);
		}
		System.out.println("**********list—È÷§**********");
		for(Employee r: dp.getEmplist()) {
			System.out.println(r.getName());
		}
	}

}
