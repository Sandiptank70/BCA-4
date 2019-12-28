//final method modifier and final variable modifier
//final variable is known as constant
//final method cannot be overridden

class Parent
{
	final int no = 15;

	final void test()
	{
		System.out.println("final method test of class Parent is called");
	}
}

class Child extends Parent
{
/*	
	void test()
	{
		System.out.println("test method of child class is called");
	}
*/

	void show()
	{
		System.out.println("show method of child class is called");
	}
}

class FinalDemo2
{
	public static void main(String arg[])
	{
		Child obj = new Child();

		System.out.println("obj.no = " + obj.no);
		obj.test();
		obj.show();
	}
}
