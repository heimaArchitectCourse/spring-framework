package aop.pattern.cor;

//具体处理者角色--部门经理
public class DepartmentManagerApproval extends Handler {
	public void handleRequest(int request) {
		if (request > 1 && request <= 5) {
			System.out.println("部门经理处理请假请求");
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
