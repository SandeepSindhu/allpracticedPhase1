package myPackage;

public class MyClass {

	public static void main(String[] args) 
	{
		//obj for mathematics outer class
		Mathematics m = new Mathematics();
		
		//inner class object declaration
		Mathematics.Geometry g = m.new Geometry();
		
		System.out.println(g.circleArea(7));
		
		//static class use directly
		System.out.println(Mathematics.StaticInnerClass.Algebra.add(5, 7));



	}

}
