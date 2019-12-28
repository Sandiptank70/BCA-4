//Use of super keyword

class A
{
	void show()
	{
		System.out.println("A => show is called");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("B => show is called");
		super.show();		
	}
}

class Inheritance9
{
	public static void main(String arg[])
	{
		B obj = new B();
		obj.show();
	}
}
