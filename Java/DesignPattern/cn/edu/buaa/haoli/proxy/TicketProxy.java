package cn.edu.buaa.haoli.proxy;
/*��̬������
 * ��ɫ������
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
		System.out.println("��֤���");
	}
	private void log(){
		System.out.println("��������־��¼");
	}
	
}
