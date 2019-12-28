//Single Inheritance - private modifier

class Parent
{
	private int no;

	private void setdata(int n)
	{
		no = n;
	}
	void display()
	{
		setdata(10);
		System.out.println("Number = " + no);
	}
}

class Child extends Parent
{
	private String str;

	void setvalue(String s)
	{
		str = s;
		show();
	}

	private void show()
	{
		System.out.println("String = " + str);
	}
}

class Inheritance3
{
	public static void main(String arg[])
	{
		Child obj = new Child();
		obj.display();
		obj.setvalue("India");
	}
}