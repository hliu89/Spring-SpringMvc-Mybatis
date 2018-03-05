package Util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

final public class applicationutil {

	private static ApplicationContext ac=null;
	private applicationutil() {
		
	}
	static {
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	public static ApplicationContext getApplicationContext() {
		return ac;
	}
}
