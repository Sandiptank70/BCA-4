//GregorianCalendar class

import java.util.*;

class GregorianCalendarDemo
{
	public static void main(String arg[])
	{
		GregorianCalendar obj = new GregorianCalendar();

		//System.out.println(obj);

		System.out.println("obj.get(Calendar.YEAR) = " + obj.get(Calendar.YEAR));

		System.out.println("obj.get(Calendar.MONTH) = " + obj.get(Calendar.MONTH));

		System.out.println("obj.get(Calendar.DAY_OF_WEEK) = " + obj.get(Calendar.DAY_OF_WEEK));

		System.out.println("obj.get(Calendar.DAY_OF_MONTH) = " + obj.get(Calendar.DAY_OF_MONTH));

		System.out.println("obj.get(Calendar.DAY_OF_YEAR) = " + obj.get(Calendar.DAY_OF_YEAR));

		System.out.println("obj.isLeapYear(2019) = " + obj.isLeapYear(2019));

		GregorianCalendar inst = new GregorianCalendar(2000,10,10);

		System.out.println("obj.after(inst) = " + obj.after(inst));

		System.out.println("obj.before(inst) = " + obj.before(inst));

		System.out.println("obj.equals(inst) = " + obj.equals(inst));
	}
}
