package pattern.factory.method;

public class Test {
	public static void main(String[] args) {
		PhoneFactory mi=new MiPhoneFactory();
		mi.createPhone();
		PhoneFactory ip=new IPhoneFactory();
		ip.createPhone();
	}
}
