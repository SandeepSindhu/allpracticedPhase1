package myPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

	public static void main(String[] args) 
	{
		//user input
		String s;
		System.out.println("Enter your code :");
		Scanner obj=new Scanner(System.in);
		s=obj.next();
		
		//write regular expression pattern
		Pattern p=Pattern.compile("[A-Z]{3}");
		
		//to match pattern
		Matcher m=p.matcher(s);
		
		if(m.matches())
			System.out.println("Valid Code");
		else
		    System.out.println("Invalid Code");
		obj.close();
	}

}
