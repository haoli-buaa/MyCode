
public class B extends A{

	static{
		System.out.println("B Static statements");
	}
	{
		System.out.println("B Instance statements");
	}
	public B(){
		System.out.println("construct B");
	}

}
