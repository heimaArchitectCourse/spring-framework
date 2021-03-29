package aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: twc
 * @Date 2021/3/27 17:20
 **/
@Aspect
@Component
public class testAspect {



	@Around(value = "pointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		joinPoint.proceed();
		System.out.println("进入环绕通知");
	}

	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("@Before进入前置通知:" + Arrays.toString(joinPoint.getArgs()));
	}

	@Pointcut(value = "execution(* aop.impl.SlaverImpl.*(..))")
	public void pointCut(){
		System.out.println("进入切点");
	}

}
