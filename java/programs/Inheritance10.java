//Use of super keyword

class Base
{
	int n;
	Base(int no)
	{
		n = no;
	}
	
}

class Derived extends Base
{
	int n;
	Derived(int no)
	{
		super(20);
		n = no;
	}
	void display()
	{	
		System.out.println("N = " + super.n);
		System.out.println("N = " + n);
	}	
}

class Inheritance10
{
	public static void main(String arg[])
	{
		Derived obj = new Derived(10);

		obj.display();		
	}
}
