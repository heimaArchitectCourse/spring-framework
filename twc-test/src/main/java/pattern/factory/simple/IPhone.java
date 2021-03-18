package pattern.factory.simple;

public class IPhone implements Phone {
	public IPhone() {
		this.make();
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("生产苹果手机!");
	}
}