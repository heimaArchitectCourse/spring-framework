package pattern.factory.simple;

public class PhoneFactory {
	//如果设置为static，就是简单工厂里面的静态工厂
	public Phone getMakePhone(String phoneType) {
		if (phoneType.equalsIgnoreCase("MiPhone")) {
			return new MiPhone();
		} else if (phoneType.equalsIgnoreCase("iPhone")) {
			return new IPhone();
		}
		return null;
	}


}
