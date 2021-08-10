package myPackage;

import java.util.ArrayList;

class Product
{
	int id;
	String name;
	
	Product(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class LambdaExp {
	
	

	public static void main(String[] args) 
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1,"TV"));
		products.add(new Product(2,"MOBILE"));
		products.add(new Product(3,"LAPTOP"));
		
		//to print collection values that too of custom class
		for(int i=0;i<products.size();i++)
		{
		System.out.println(products.get(i).id+" "+products.get(i).name);
		}

	}

}
