//Multiple interface

interface Inf1
{
	int a=11;
	void print1();
}

interface Inf2
{
	int b=22;
	void print2();
}

interface Inf3
{
	int c=33;
	void print3();
}

class Test implements Inf1, Inf2, Inf3
{
	public void print1()
	{
		System.out.println("Inf1=>print1 is called");
	}

	public void print2()
	{
		System.out.println("Inf2=>print2 is called");
	}

	public void print3()
	{
		System.out.println("Inf3=>print3 is called");
	}
}

class InterfaceDemo2
{
	public static void main(String arg[])
	{
		Test obj = new Test();
		
		System.out.println("obj.a = " + obj.a);
		System.out.println("Test.b = " + Test.b);
		System.out.println("Inf3.c = " + Inf3.c);
		
		obj.print1();
		obj.print2();
		obj.print3();
	}
}
