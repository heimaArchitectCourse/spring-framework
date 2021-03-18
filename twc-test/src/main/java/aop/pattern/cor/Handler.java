package aop.pattern.cor;

//抽象处理者角色
public abstract class Handler {
	//下一个处理者
	private Handler next;

	//设定下一个处理者
	public void setNext(Handler next) {
		this.next = next;
	}

	//获取下一个处理者
	public Handler getNext() {
		return next;
	}

	//每个处理者都必须实现的处理任务
	public abstract void handleRequest(int request);
}
