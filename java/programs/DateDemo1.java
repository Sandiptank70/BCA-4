//Date class

import java.util.*;

class DateDemo1
{
	public static void main(String arg[])
	{
		Date obj = new Date();
		Date bd = new Date(100,7,24);
		Date d = new Date("12/12/2019");

		System.out.println("obj = " + obj);
		System.out.println("BirthDate = " + bd);
		System.out.println("D = " + d);

		System.out.println("obj.after(bd) = " + obj.after(bd));

		System.out.println("obj.before(bd) = " + obj.before(bd));

		System.out.println("obj.compareTo(bd) = " + obj.compareTo(bd));

		System.out.println("obj.equals(bd) = " + obj.equals(bd));

		System.out.println("obj.getYear() = " + obj.getYear());

		System.out.println("obj.getMonth() = " + obj.getMonth());

		System.out.println("obj.getDay()= " + obj.getDay());

		System.out.println("obj.getHours() = " + obj.getHours());

		System.out.println("obj.getMinutes() = " + obj.getMinutes());

		System.out.println("obj.getSeconds() = " + obj.getSeconds());

	}
}
