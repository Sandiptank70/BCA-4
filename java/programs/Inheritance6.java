/*
	Hybrid Inheritance

		A
		|
		B
		|
	-----------------
	|		|
	C		D


		A
		|
	-----------------
	|		|
	B		C
	|
	D

*/

class A
{
	void dispA()
	{
		System.out.println("dispA method of class A is called");
	}
}

class B extends A
{
	void dispB()
	{
		System.out.println("dispB method of class B is called");
	}
}

class C extends A
{
	void dispC()
	{
		System.out.println("dispC method of class C is called");
	}
}

class D extends B
{
	void dispD()
	{
		System.out.println("dispD method of class D is called");
	}
}

class Inheritance6
{
	public static void main(String arg[])
	{
		C obj1 = new C();
		D obj2 = new D();

		obj1.dispA();
		obj1.dispC();

		System.out.println();

		obj2.dispA();
		obj2.dispB();
		obj2.dispD();
	}
}