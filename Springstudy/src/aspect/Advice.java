package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {

	public void before() {
		
		System.out.println("before advice");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before around");
		Object proceed=pjp.proceed();
		System.out.println("after around");
	}
}
