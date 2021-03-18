package pattern.factory.simple;

public class Test {

	//测试简单工厂
	//简单工厂有静态工厂和实例工厂，当前为实例工厂
	public static void main(String[] arg) {
		PhoneFactory factory = new PhoneFactory();
		Phone miPhone = factory.getMakePhone("MiPhone");
		IPhone iPhone = (IPhone) factory.getMakePhone("iPhone");
	}
}

