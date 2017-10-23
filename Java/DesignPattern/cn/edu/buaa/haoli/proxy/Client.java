package cn.edu.buaa.haoli.proxy;

public class Client {
	public static void main(String[] args){
		//静态代理模式
		TicketManager tm = new TicketManagerImpl();
		TicketProxy tp = new TicketProxy(tm);
		tp.soldTicket();
		//动态代理模式
		DynamicTicketProxy dtp = new DynamicTicketProxy();
		TicketManager dtm = (TicketManager)dtp.newProxyInstance(new TicketManagerImpl());
		dtm.soldTicket();
	}
}
