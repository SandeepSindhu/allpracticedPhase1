package myPackage;

public class MyClass {
	public static void main(String args[])
	{
		//jagged-array
		int matrix[][] = {{1,2,3},{4,5,6,3,6},{7,8}};
		
		//matrix.length gives no. of rows
		for(int i=0;i<matrix.length;i++)
		{
			//matrix[i].length gives no. of elements in a row
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
