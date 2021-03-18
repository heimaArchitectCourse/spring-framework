package pattern.factory.simple;

public class MiPhone implements Phone {
	public MiPhone() {
		this.make();
	}
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("生产小米手机!");
	}
}