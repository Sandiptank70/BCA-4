/*
	Nested and Inner class


	Inner class

		- Member Inner class
		- Local Inner class
		- Anonymous Inner class

	Nested class
*/

//Member Inner class

class Outer1
{
	void show()
	{
		System.out.println("show method of class Outer1 is called");

		Inner1 obj1 = new Inner1();
		obj1.display();
	}

	class Inner1
	{
		void display()
		{
			System.out.println("display method of Inner1 is called");
		}
	}
}


class InnerDemo1
{
	public static void main(String arg[])
	{
		Outer1 obj = new Outer1();
		obj.show();
	}
}
