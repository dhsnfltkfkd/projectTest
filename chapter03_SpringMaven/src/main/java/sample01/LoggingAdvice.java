package sample01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//Aspect-공통관심사항
@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class LoggingAdvice {
	
	@Before("execution(public void sample01.MessageBeanImpl.*Before())")
	public void beforeTrace(){
		System.out.println("before trace...");
	}
	
	@After("execution(public * *.*.*After(..))")
	public void afterTrace(){
		System.out.println("after trace...");
	}
	
	@Around("execution(public * *.*.*Print(..))")
	public void trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println("methodName="+methodName);
		
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		System.out.println("호출 전 = "+ methodName);
		
		Object ob = joinPoint.proceed();//핵심관심사항 호출
		System.out.println("결과 = "+ob);
		
		sw.stop();
		System.out.println("호출 후 = "+ methodName);
		System.out.println("처리시간 = "+sw.getTotalTimeMillis()/1000+"초");
		
	}

}
