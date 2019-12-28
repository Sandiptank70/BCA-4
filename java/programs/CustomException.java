//Custom Exception or User Defined Exception


class MyException1 extends Exception
{
	MyException1(String msg)
	{
		super(msg);	
	}
}

class MyException2 extends Exception
{
	MyException2(String msg)
	{
		super(msg);
	}
}


class CustomException
{
	public static void main(String arg[]) throws MyException1, MyException2
	{
		int no = Integer.parseInt(arg[0]);

		if(no % 2 == 1)
		{
			throw new MyException1("Problem");
		}

		else
		{
			throw new MyException2("Big Problem");
		}
	}
}
