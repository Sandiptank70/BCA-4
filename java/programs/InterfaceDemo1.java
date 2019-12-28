/*
	Interface

	An interface is a collection of method declarations and variable declarations.

	
	All methods of an interface are public abstract by default.

	All variables of an interface are public static final by default.

	We cannot create an object of an interface but we can create object reference of an interface

	Declaration of interface
	Syntax:
		interface InterfaceName
		{
			Method declarations;
		
			Variable Declarations;
		}

	We can implement interfaces in our class using implements keyword.

	class ClassName implements Intefaces
	{

	}
*/


interface Inf1
{
	void show();
	int no = 12;
}

class Test implements Inf1
{
	public void show()
	{
		System.out.println("show is called");
	}
}

class InterfaceDemo1
{
	public static void main(String arg[])
	{
		Test obj = new Test();
		obj.show();
		System.out.println("obj.no = " + obj.no);
		System.out.println("Inf1.no = " + Inf1.no);
		System.out.println("Test.no = " + Test.no);

	}
}
