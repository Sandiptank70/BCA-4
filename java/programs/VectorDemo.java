//Vector class

import java.util.*;

class VectorDemo
{
	public static void main(String arg[])
	{	
		Vector v = new Vector();
		
		System.out.println("v.isEmpty() = " + v.isEmpty());

		System.out.println("v.capacity() = " + v.capacity());

		System.out.println("v.size() = " + v.size());

		v.add("First");
		v.add(new Integer(123));
		v.add("Test");
		v.add(new Float(3.14f));
		v.add("Last");

		System.out.println("v = " + v);

		System.out.println("v.capacity() = " + v.capacity());

		System.out.println("v.size() = " + v.size());

		int a;

		for(a=1;a<=6;a++)
		{
			v.addElement("Val" + a);
		}

		System.out.println(v);

		System.out.println("v.capacity() = " + v.capacity());

		System.out.println("v.size() = " + v.size());

		System.out.println("v.contains(Test) = " + v.contains("Test"));

		System.out.println("v.elementAt(3) = " + v.elementAt(3));

		Enumeration e = v.elements();

		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement().toString());
		}

		System.out.println("v.remove(2) = " + v.remove(2));

		System.out.println("v = " +v);
		
	}
}
