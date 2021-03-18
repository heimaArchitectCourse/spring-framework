package aop.pattern.cor;

//具体处理者角色--Leader
public class LeaderApproval extends Handler {
	public void handleRequest(int request) {
		if (request == 1) {
			System.out.println("Leader处理请假请求");
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
