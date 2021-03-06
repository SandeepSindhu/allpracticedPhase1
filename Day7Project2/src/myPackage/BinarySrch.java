package myPackage;

import java.util.Arrays;
import java.util.List;

public class BinarySrch {

	public static void main(String[] args) 
	{
		List<Integer> data = Arrays.asList(12,14,23,27,45,56,67,78,89,90,99);
		
		int search=97;
		
		int low,mid,high;
		low=0;
		high=data.size();
		mid=(low+high)/2;
		
		while(true)
		{
			if(search==data.get(mid))
			{
				System.out.println("found at "+mid);
				break;
			}
			
			if(low==mid || high==mid)
			{
				System.out.println("not found");
				break;
			}
			
			if(search>data.get(mid))
				low=mid;
			else
				high=mid;
			
			//updating mid value
			mid=(low+high)/2;
		}
		
		
	}

}
