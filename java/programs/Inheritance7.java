//Constructor in Inheritance

class Parent
{
	Parent()
	{
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent
{
	Child()
	{
		System.out.println("Child constructor");
	}
}

class Inheritance7
{
	public static void main(String arg[])
	{
		Child obj = new Child();
	}
}
