
//Method Overloading

class Message
{
	void show()
	{
		System.out.println("show method without argument");
	}

	void show(int n)
	{
		System.out.println("\nshow method with one argument");
		System.out.println("Argument = " + n);
	}

	void show(int n, String str)
	{
		System.out.println("\nshow method with two arguments");
		System.out.println("Argument 1 = " + n);
		System.out.println("Argument 2 = " + str);
	}

}

class ClassDemo10
{
	public static void main(String arg[])
	{
		Message obj= new Message();

		obj.show();
		obj.show(10);
		obj.show(20, "India");
	}
}
