package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		int age;
		Scanner obj = new Scanner(System.in);
		char ch='i';
		
		do
		{
		System.out.println("enter yor age");
		age=obj.nextInt();
		
		if(age<=0 || age>100)
		{
			System.out.println("invalid age enetred");
			
		}
		else
		{
			System.out.println("valid age enetred");
			ch='v';
		}
		
		}while(ch!='v');
		obj.close();
			
	}
	

}
