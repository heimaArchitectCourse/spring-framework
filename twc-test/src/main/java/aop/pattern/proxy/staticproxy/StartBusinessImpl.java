package aop.pattern.proxy.staticproxy;

//目标对象，实现类
public class StartBusinessImpl implements IStartBusiness {
	@Override
	public void sing() {
		System.out.println("sing>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
