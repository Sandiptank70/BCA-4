//get data

import java.io.*;

class GetData
{
	public static void main(String arg[])
	{
	   try
	   {
		InputStreamReader isr=new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		int age;
		String name;

		System.out.print("Enter your name = ");
		name = br.readLine();

		System.out.print("Enter your age = ");
		age = Integer.parseInt(br.readLine());

		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		
	   }
	   catch(Exception e)
	   {
		System.out.println(e);
	   }
	}
}