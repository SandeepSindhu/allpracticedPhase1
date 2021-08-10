package myPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass {
	
	public static void main(String args[])
	{
		
		List<Integer> data = Arrays.asList(12,13,14,2,45,56,97,32,76,67);
		
		
		int k,i=-1;
		System.out.println("enter the search element:");
		Scanner obj = new Scanner(System.in);
		k=obj.nextInt();
		
		
		for(int d:data)
		{
			i++;
			if(d==k)
			{
				System.out.println(d+" found at index "+data.indexOf(d));
				break;
			}
			
		}
		
		if(i==data.size())
			System.out.println("element not found!");
		obj.close();
		
	}

}
