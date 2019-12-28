//Local Inner class

class Outer2
{
	void display()
	{
		System.out.println("display method of class Outer2 is called");

		class Inner2
		{
			void show()
			{
				System.out.println("show method of class Inner2 is called");
			}
		}

		Inner2 obj2 = new Inner2();
		obj2.show();
	}
}

class InnerDemo2
{
	public static void main(String arg[])
	{
		Outer2 obj = new Outer2();
		obj.display();
	}
}

			