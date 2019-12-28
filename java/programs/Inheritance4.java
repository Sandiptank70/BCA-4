//Multilevel Inheritance

class A
{
	void showA()
	{
		System.out.println("A=>showA() is called");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("B=>showB() is called");
	}
}

class C extends B
{
	void showC()
	{
		System.out.println("C=>showC() is called");
	}
}

class Inheritance4
{
	public static void main(String arg[])
	{
		C obj = new C();

		obj.showA();
		obj.showB();
		obj.showC();
	}
}
