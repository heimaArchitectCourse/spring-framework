package aop.pattern.cor;
//具体处理者角色--技术总监
public class CTOApproval extends Handler {
	public void handleRequest(int request) {
		if (request>5&&request<=15) {
			System.out.println("CTO处理请假请求");
		} else {
			//下一处理者不为空
			if (getNext() != null) {
				getNext().handleRequest(request);
			} else {
				System.out.println("没有人处理该请求！");
			}
		}
	}
}
