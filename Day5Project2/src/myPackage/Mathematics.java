package myPackage;

public class Mathematics 
{
	public final float PI = 22/7;
	
	//inner class
	class Geometry
	{
		public float circleArea(int r)
		{
			return PI*r*r;
		}
		
		public float circlePerimeter(int r)
		{
			return 2*PI*r;
		}
	}
	
	//inner static class
	public class StaticInnerClass 
	{
		static class Algebra
		{
			public static int add(int a,int b)
			{
				return a+b;
			}
		}
		
		

	}

}
