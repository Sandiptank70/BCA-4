//throw keyword
//Syntax: throw ExceptionClassObject

class ThrowDemo1
{
	public static void main(String arg[])
	{
	   try
	   {
		System.out.println("Before throwing exception");
		throw new ArithmeticException();
	

/*		ArithmeticException obj = new ArithmeticException("Exception");
	
		throw obj; */
	   }
	   catch(ArithmeticException ae)
	   {
		System.out.println("Exception Caught");
	   }
	   catch(Exception  e)
	   {
		System.out.println("Exception : " + e);
	   }
	}
}
