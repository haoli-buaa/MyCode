package cn.edu.buaa.haoli.proxy;
/*静态代理类
 * 角色：代理
 * */
public class TicketProxy implements TicketManager{
	
	private TicketManager ticketManager;
	public TicketProxy(TicketManager ticketManager){
		this.ticketManager = ticketManager;
	}
	@Override
	public void soldTicket() {
		// TODO Auto-generated method stub
		checkIdentity();
		ticketManager.soldTicket();
		log();
	}
	private void checkIdentity(){
		System.out.println("验证身份");
	}
	private void log(){
		System.out.println("保存至日志记录");
	}
	
}
