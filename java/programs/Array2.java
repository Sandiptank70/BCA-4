/*
	Write a Java program to enter values in array from command line arguments and sort them.

*/

class Array2
{
	public static void main(String arg[])
	{
		int []arr = new int[arg.length];

		int a, b, c;

		for(a=0;a<arg.length;a++)
		{
			arr[a] = Integer.parseInt(arg[a]);
		}

		System.out.println("Before Sorting : ");
		for(a=0;a<arr.length;a++)
		{
			System.out.println("\t" + arr[a]);
		}

		for(a=0;a<arr.length;a++)
		{
			for(b=a+1;b<arr.length;b++)
			{
				if(arr[a] > arr[b])
				{
					c = arr[a];
					arr[a] = arr[b];
					arr[b] = c;
				}
			}
		}
	
		System.out.println("After Sorting : ");
		for(a=0;a<arr.length;a++)
		{
			System.out.println("\t" + arr[a]);
		}
	}
}
