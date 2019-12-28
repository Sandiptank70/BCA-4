//Returning value from a method

class Calc2
{
	int qty;
	float price;

	void setdata(int q, float p)
	{
		qty = q;
		price = p;
	}

	float product()
	{
		float ans;
		ans= qty * price;
		return ans;
	}
}

class ClassDemo7
{
	public static void main(String arg[])
	{
		Calc2 obj=new Calc2();

		obj.setdata(15, 2.75f);

		float res= obj.product();

		System.out.println("Amount = " + res);
	}
}
