//Constructor Overloading

class Test
{
	int num;
	String str;

	Test()
	{
		num=11;
		str="India";
	}

	Test(int n)
	{
		num=n;
		str="Bharat";
	}

	Test(int n, String s)
	{
		num=n;
		str=s;
	}
	
	void display()
	{
		System.out.println("\nNumber = " + num);
		System.out.println("String = " + str);
	}
}


class ClassDemo13
{
	public static void main(String arg[])
	{
		Test obj1 = new Test();
		Test obj2 = new Test(22);
		Test obj3 = new Test(33, "Hindustan");

		obj1.display();
		obj2.display();
		obj3.display();
	}
}
