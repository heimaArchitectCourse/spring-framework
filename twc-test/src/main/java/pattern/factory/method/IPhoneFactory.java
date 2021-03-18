package pattern.factory.method;

public class IPhoneFactory implements PhoneFactory {
	@Override
	public AbstractPhone createPhone() {
		System.out.println("苹果手机实例");
		return new IPhone();
	}
}
