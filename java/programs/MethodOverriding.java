//Method overriding

class First
{
	void show()
	{
		System.out.println("show method of First class is called");
	}
}

class Second extends First
{
	void show()
	{
		System.out.println("show method of Second class is called");
	}
}

class MethodOverriding
{
	public static void main(String arg[])
	{
		Second obj=new Second();
		obj.show();
	}
}
