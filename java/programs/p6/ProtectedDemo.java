package p6;

import p5.*;

class Child extends Test
{
	void print()
	{
		n = 15;
		System.out.println("n = " + n);

		show();
	}
}

class ProtectedDemo 
{
	public static void main(String arg[])
	{
		Child obj = new Child();
		obj.print();
	}
}
