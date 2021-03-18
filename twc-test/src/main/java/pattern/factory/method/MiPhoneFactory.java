package pattern.factory.method;

public class MiPhoneFactory implements PhoneFactory {
	@Override
	public AbstractPhone createPhone() {
		System.out.println("小米手机实例");
		return new MiPhone();
	}
}
