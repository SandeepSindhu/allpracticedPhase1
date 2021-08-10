package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter any number:");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
		obj.next();
		obj.close();

	}

}
