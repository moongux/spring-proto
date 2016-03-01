package hello;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {
	@Before("execution(* hello.MessagePrinter.printMessage(..))")
	public void aspectCall(JoinPoint joinPoint) {
		System.out.println("Aspect Call");
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getArgs());
	}
}
