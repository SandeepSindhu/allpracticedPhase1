package myPackage;

public class SelectSort {

	public static void main(String[] args) 
	{
		int arr[] = {12,15,45,56,67,78,54,32,21,11};
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			
			int small = arr[index];
			arr[index] = arr[i];
			arr[i] = small;
			
		}
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		

	}

}
