package aop.pattern.cor;
//责任链测试
public class Test {
	public static void main(String[] args) {

		//1天
		Handler handler1 = new LeaderApproval();
		//request>1&&request<=5
		Handler handler2 = new DepartmentManagerApproval();
		//request>5&&request<=15
		Handler handler3 = new CTOApproval();
		//request>15
		Handler handler4 = new CEOApproval();


		//此处可以无限扩展控制类型
		//创建职责链
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		handler3.setNext(handler4);

		//发起一次审批请求
		handler1.handleRequest(4);


	}
}
