//Hashtable class

import java.util.*;

class HashtableDemo
{
	public static void main(String arg[])
	{
		Hashtable obj = new Hashtable();

		obj.put("Apple", "Red");
		obj.put("Orangle", "Orange");
		obj.put("Grapes", "Green");
		obj.put("Mango", "Green");
		obj.put("Watermelon", "Red");

		System.out.println("The color of Grapes = " + obj.get("Grapes"));

		Enumeration e = obj.keys();

		while(e.hasMoreElements())
		{
			Object k = e.nextElement();
			Object v = obj.get(k);

			System.out.println("Key = " + k + "\tValue = " + v);
		}
	}
}
