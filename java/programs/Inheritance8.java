//Constructor in Inheritance - Use of super keyword

class Parent
{
	private int n;
	Parent(int no)
	{
		n=no;
	}
	void show()
	{
		System.out.println("Number = " + n);
	}
}

class Child extends Parent
{
	private String str;

	Child(int no, String s)
	{
		super(no);
		str = s;
	}
	void display()
	{
		System.out.println("String = " +str);
	}
}

class Inheritance8
{
	public static void main(String arg[])
	{
		Child obj = new Child(Integer.parseInt(arg[0]), arg[1]);

		obj.show();
		obj.display();
	}
}
