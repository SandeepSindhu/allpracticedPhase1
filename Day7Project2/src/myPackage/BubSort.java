package myPackage;

public class BubSort {

	public static void main(String[] args) 
	{
		int data[]= {45,67,23,88,12,17,91,99,13,16,18,24};
		int MAX=data.length;
		int temp;
		
		//no of comparisons in max-1
		for(int i = MAX-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(data[j]>data[j+1])
				{
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		for(int i=0;i<MAX;i++)
		{
		System.out.println(data[i]);
		}

	}

}
