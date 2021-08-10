
public class EnhancedArray 
{
	public static void main(String args[])
	{
		int nums[] = {6,8,3,7,5,6,1,4};
		int val =9;
		boolean found = false;
		
		//using "for-each" sstyle of for
		for(int x : nums)
		{
			if(x==val)
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("Value found!");
		else
			System.out.println("Value not found!");
			
		}
	}


