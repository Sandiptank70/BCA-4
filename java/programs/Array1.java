/*
	Array

	An array is a collection of variables of same data type.


	Types of Array
		
		- One Dimension Array / Single Dimension Array
	
		- Rectangle Array / Double Dimension Array

		- Jagged Array / Ragged Array


One Dimension Array

Declaration

	Syntax:
		DataType ArrayName[] = new DataType[ArraySize];

		or

		DataType []ArrayName = new DataType[ArraySize];
*/

class Array1
{
	public static void main(String arg[])
	{
		int arr[] = new int[10];

		//int []arr = new int[10];

		int a;

		for(a=0;a<10;a++)
		{
			arr[a] = (a+1) * 10;
		}

		for(a=0;a<10;a++)
		{
			System.out.println("\t" + arr[a]);
		}
	}
}
 

