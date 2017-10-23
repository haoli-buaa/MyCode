package cn.edu.buaa.haoli.proxy;
/*代理模式
 * 角色：真实主题角色
 * */
public class TicketManagerImpl implements TicketManager{

	@Override
	public void soldTicket() {
		// TODO Auto-generated method stub
		System.out.println("售票成功");
	}

}
