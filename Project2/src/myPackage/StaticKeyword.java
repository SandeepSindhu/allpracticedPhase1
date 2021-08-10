package myPackage;

class StaticKeyword {
	
	int rollno;
	String name;
	static String college = "GJU";
	static void change()
	{
		college="GJUST";
	}
	StaticKeyword(int r,String n)
	{
		rollno=r;
		name=n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {

		StaticKeyword.change();
		StaticKeyword s1=new StaticKeyword(1,"Sandeep");
		StaticKeyword s2=new StaticKeyword(2,"Mandeep");
		StaticKeyword s3=new StaticKeyword(3,"Amandeep");
		s1.display();
		s2.display();
		s3.display();

	}

}
