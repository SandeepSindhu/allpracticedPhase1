
public class Break {
	public static void main(String args[])
	{
		boolean t = true;
		first:{
			second:{
				third:{
					System.out.println("Before the break.");
					if(t) break second;  //break out of second block
					System.out.println("this wont execute!");
				}
				System.out.println("this is in second block"); //this wont execute either
			}
			System.out.println("this is after second block");
		}
			
	}

}
