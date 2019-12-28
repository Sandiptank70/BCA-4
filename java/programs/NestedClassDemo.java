//static Nested class

class Outer4
{
	static class Inner4
	{
		void show()
		{
			System.out.println("show of Inner4 is called");
		}
	}
}


class NestedClassDemo
{
	public static void main(String arg[])
	{
		Outer4.Inner4 obj = new Outer4.Inner4();

		obj.show();
	}
}
