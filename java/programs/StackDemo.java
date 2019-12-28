//Stack class

import java.util.*;

class StackDemo
{
	public static void main(String arg[])
	{
		Stack obj = new Stack();

		System.out.println("obj.empty() = " + obj.empty());

		obj.push("First");
		obj.push("Second");
		obj.push("Third");
		obj.push("Fourth");
		obj.push("Fifth");

		System.out.println("obj = " + obj);

		System.out.println("obj.pop() = " + obj.pop());

		System.out.println("obj = " + obj);

		obj.remove(2);

		System.out.println("obj = " + obj);
	}
}
