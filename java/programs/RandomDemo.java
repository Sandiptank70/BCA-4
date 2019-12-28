//Random class - java.util package


import java.util.*;

class RandomDemo
{
	public static void main(String arg[])
	{
		Random obj = new Random();

		System.out.println("obj.nextInt() = " + obj.nextInt());

		for(int a=1;a<=10;a++)
		{
			System.out.println("\t" + obj.nextInt());
		}
		System.out.println("obj.nextInt(100) = " + obj.nextInt(100));

	}
}
