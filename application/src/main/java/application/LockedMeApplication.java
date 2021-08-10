package application;

public class LockedMeApplication {
	
	public String returnSomething()
	{
		System.out.println("something");
		return "s";
	}

	public static void main(String[] args) 
	{
		LockedMeApplication obj = new LockedMeApplication();
		obj.returnSomething();

	}

}
