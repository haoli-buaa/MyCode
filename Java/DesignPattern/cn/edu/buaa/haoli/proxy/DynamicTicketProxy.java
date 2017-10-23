package cn.edu.buaa.haoli.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicTicketProxy implements InvocationHandler{
	private TicketManager ticketManager;
	public Object newProxyInstance(TicketManager ticketManager){
		this.ticketManager = ticketManager;
		return Proxy.newProxyInstance(ticketManager.getClass().getClassLoader(), ticketManager.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		CheckIdentity();
		result = method.invoke(ticketManager, args);
		Log();
		return result;
	}
	private void CheckIdentity(){
		System.out.println("身份已验证");
	}
	private void Log(){
		System.out.println("已记录至日志");
	}

}
