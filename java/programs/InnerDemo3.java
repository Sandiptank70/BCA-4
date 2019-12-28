//Anonymous Inner class


abstract class Inner3
{
	public abstract void show();
}

class Outer3
{
	void display()
	{
		System.out.println("display of Outer3 is called");

		Inner3 obj3 = new Inner3()
		{
			public void show()
			{
				System.out.println("show of Inner3 is called");
			}
		};

		obj3.show();
	}
}
			

class InnerDemo3
{
	public static void main(String arg[])
	{
		Outer3 obj = new Outer3();

		obj.display();
	}
}
