package pattern.template;

//模板模式
public class SubTemplatePattern extends TemplatePattern {
	@Override
	public void step1() {
		System.out.println(">>>>>>>>>>>>>>1");
	}

	@Override
	public void step2() {
		System.out.println(">>>>>>>>>>>>>>2");

	}

	@Override
	public void step3() {
		System.out.println(">>>>>>>>>>>>>>3");

	}

	@Override
	public void step4() {
		System.out.println(">>>>>>>>>>>>>>4");
	}
	public static void main(String[] args) {
		TemplatePattern tp = new SubTemplatePattern();
		tp.refresh();
	}
}
