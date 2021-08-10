package package2;

public class Ternary {

	public static void main(String[] args) 
	{
		int i,k;
		
		i=10;
		
		k = i<0 ? -i : i; //get absolute value of i
		
		System.out.print("Absolute value of ");
		System.out.println(i+" is "+k);
		
		i=-10;
		
        k = i<0 ? -i : i; //get absolute value of i
		
		System.out.print("Absolute value of ");
		System.out.println(i+" is "+k);
		
		int p=100;
		int q=200;
		
		while(++p < --q);
		
		System.out.print("Mid piont is "+p);

	}

}
