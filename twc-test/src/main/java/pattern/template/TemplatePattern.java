package pattern.template;

//模板模式
public abstract class TemplatePattern {
	protected abstract void step1();

	protected abstract void step2();

	protected abstract void step3();

	protected abstract void step4();

	//模板方法
	public final void refresh() {
		//此处也可加入当前类的一个方法实现，例如init()
		step1();
		step2();
		step3();
		step4();
	}


}
