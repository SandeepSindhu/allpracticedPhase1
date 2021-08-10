package mypackage;

interface ISalary
{
	default void DeveloperName()
	{
		System.out.println("sandeep");
	}
	int getHRA(int basic);
	int getBonus();

}

class Microsoft implements ISalary
{

	@Override
	public int getHRA(int basic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
