//Passing argument to a method

class Calc
{
	int a, b;
	void setdata(int x, int y)
	{
		a = x;
		b = y;
	}
	
	void display()
	{
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}

class ClassDemo6
{
	public static void main(String arg[])
	{
		Calc obj = new Calc();

		obj.setdata(10, 15);

		obj.display();

	}
}
