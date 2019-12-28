//final class
//final class cannot be extended.

final class One
{
	void show()
	{
		System.out.println("show of One is called");
	}
}

/*
class Two extends One
{
}
*/

class FinalDemo1
{
	public static void main(String arg[])
	{
		One obj=new One();
		obj.show();
	}
}

