//static method

class Test
{
	static void show()
	{
		System.out.println("Static method is called");
		Message obj=new Message();
		obj.display();
	}
}

class ClassDemo2
{
	public static void main(String arg[])
	{
		Test.show();

		Test obj = new Test();
		obj.show();

	}
}




