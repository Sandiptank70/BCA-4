//Single Inheritance

class Parent
{
	void show()
	{
		System.out.println("show method of Parent class is called");
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("display method of Child class is called");
	}
}

class Inheritance1
{
	public static void main(String arg[])
	{
		Child obj = new Child();
		obj.show();
		obj.display();
	}
}
