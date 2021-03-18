package aop.pattern.proxy.dynamic;

//目标对象
public class StartBusinessImpl implements IStartBusiness {
	@Override
	public void sing() {
		System.out.println("sing>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
