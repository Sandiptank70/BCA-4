//abstract class modifier

//abstract class cannot be instantiated

abstract class First
{
	void display()
	{
		System.out.println("Welcome to display method");
	}
}


class Second extends First
{

}

class AbstractDemo1
{
	public static void main(String arg[])
	{
		Second obj=new Second();
		obj.display();
	}
}
