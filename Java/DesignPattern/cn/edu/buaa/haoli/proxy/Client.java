package cn.edu.buaa.haoli.proxy;

public class Client {
	public static void main(String[] args){
		//��̬����ģʽ
		TicketManager tm = new TicketManagerImpl();
		TicketProxy tp = new TicketProxy(tm);
		tp.soldTicket();
		//��̬����ģʽ
		DynamicTicketProxy dtp = new DynamicTicketProxy();
		TicketManager dtm = (TicketManager)dtp.newProxyInstance(new TicketManagerImpl());
		dtm.soldTicket();
	}
}
