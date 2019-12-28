class Convert2
{
	public static void main(String arg[])
	{
		long km = Long.parseLong(arg[0]);

		long mtr = km * 1000;

		long cm = mtr * 100;

		System.out.println("Kilometer = " + km);

		System.out.println("Meter = " + mtr);

		System.out.println("Centimeter = " + cm);
	}
}

