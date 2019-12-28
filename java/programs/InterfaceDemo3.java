/*
	use of interface in Hybrind inheritance

		A
		|
	-----------------
	|		|
	B		C
	|		|
	--------D--------

Syntax:
	ClsModifier class ClsName extends ParentClsName implements InterfaceList
	{
		//class body
	}
	
*/

class A
{
	void showA()
	{
		System.out.println("A=>showA is called");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("B=>showB is called");
	}
}

interface C
{
	void showC();
}

class D extends B implements C
{
	public void showC()
	{
		System.out.println("C=>showC is called");
	}

	void showD()
	{
		System.out.println("D=>showD is called");
	}
}

class InterfaceDemo3
{
	public static void main(String arg[])
	{
		D obj = new D();

		obj.showA();
		obj.showB();
		obj.showC();
		obj.showD();
	}
}

