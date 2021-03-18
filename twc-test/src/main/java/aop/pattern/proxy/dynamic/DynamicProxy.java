package aop.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理实现
public class DynamicProxy implements InvocationHandler {
   // 这个就是我们要代理的真实对象
   private Object obj;

   // 构造方法，给我们要代理的真实对象赋初值
   public DynamicProxy(Object object) {
       this.obj = object;
   }

   //相比静态代理，动态代理减只需要实现一个接口即可完成，而静态代理每次都要实现新加的方法以及维护被代理方法
   @Override
   public Object invoke(Object object, Method method, Object[] args)
           throws Throwable {

       //********************方法前增强***************************
       // 反射调用目标方法
       method.invoke(obj, args);
       return null;

       //********************方法后增强***************************
   }

}
