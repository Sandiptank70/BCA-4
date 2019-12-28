/*
Syntax:
	try
	{
		//statements
	}
	catch(ExceptionClassName objName)
	{
		//statements
	}
	catch(ExceptionClassName objName)
	{
		//statements
	}
	...
	...
	...
	catch(ExceptionClassName objName)
	{
		//statements
	}
	finally
	{
		//statements
	}

*/

class ExceptionDemo1
{
	public static void main(String arg[])
	{
	   try
	   {
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);

		int c = a/b;

		System.out.println("Division = " + c);
	   }
	   catch(ArithmeticException ae)
	   {
		System.out.println("Second argument must be non-zero");
	   }
	   catch(NumberFormatException ne)
	   {
		System.out.println("Argument(s) must be numeric");
	   }
	   catch(ArrayIndexOutOfBoundsException ae)
	   {
		System.out.println("You must pass at least two arguments");
	   }	
	   catch(Exception e)
	   {
		System.out.println(e);
	   }
	   finally
	   {
		System.out.println("End of Program.");
	   }
	}
}
