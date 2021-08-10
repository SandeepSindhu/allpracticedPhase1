package myPackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		List<String> list= Arrays.asList("sandeep","mandeep","kuldeep","amandeep","sukhdeep");
		
		
		
		String name;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter search name");
		name=obj.next();
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().equals(name)) {
			    System.out.println("found at index "+list.indexOf(name));
			    
			}
			
		}
		obj.close();

	}

}
