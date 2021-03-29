package aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//将这个类声明为一个切面，需要将其放入IOC容器中
//@Aspect//声明这是一个切面
//@Component//声明这是一个组件
/**
 * 执行顺序
 * @Around进入环绕通知...
 * @Before进入前置通知:[]
 * 进入实现类 work.....
 * @Around方法执行耗时>>>>>: 1001
 * @After进入后置通知...
 * @AfterReturning进入最终通知...End!
 */
public class SlaverAspect {

	//环绕通知（连接到切入点开始执行，下一步进入前置通知，在下一步才是执行操作方法）
	@Around(value = "pointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("@Around进入环绕通知...");
		long startTime = System.currentTimeMillis();
//		调用了下一个拦截器，递归调用ReflectiveMethodInvocation#proceed
		joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println(String.format("@Around   目标方法执行耗时>>>>>: %s", endTime - startTime));
	}

	//前置通知（进入环绕后执行，下一步执行方法）
	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("@Before进入前置通知:" + Arrays.toString(joinPoint.getArgs()));
	}

	//异常通知（出错时执行）
	@AfterThrowing(value = "pointCut()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
		System.out.println("@AfterThrowing进入异常通知" + Arrays.toString(joinPoint.getArgs()));

	}

	//后置通知(返回之前执行)
	@After(value = "pointCut()")
	public void after() {

		System.out.println("@After进入后置通知...");
	}

	//最终通知（正常返回通知，最后执行，出现异常）
	@AfterReturning(value = "pointCut()")
	public void afterReturning() {
		System.out.println("@AfterReturning进入最终通知...End!");
	}

	//定义一个切入点 后面的通知直接引入切入点方法pointCut即可
	//参数：
	//第一个”*“符号;表示返回值的类型任意
	//.*(..)表示任何方法名，括号表示参数，两个点表示任何参数类型
	@Pointcut(value = "execution(* aop.impl.SlaverImpl.*(..))")
	public void pointCut() {
		System.out.println("@进入切点...");
	}

}
