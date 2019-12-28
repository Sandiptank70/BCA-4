/*
	Rectangle Array / Double Dimension Array

	Declaration

	   Syntax:
		DataType ArrayName[][] = new DataType[Row][Col];

		or

		DataType [][]ArrayName = new DataType[Row][Col];

		or

		DataType []ArrayName[] = new DataType[Row][Col];
*/

class Array3
{
	public static void main(String arg[])
	{
		int [][]arr = new int[3][3];

		int a, b, c=1;

		for(a=0;a<3;a++)
		{
			for(b=0;b<3;b++)
			{
				arr[a][b] = c++;
			}
		}

		for(a=0;a<3;a++)
		{
			for(b=0;b<3;b++)
			{
				System.out.print("\t" + arr[a][b]);
			}
	
			System.out.println("\n");
		}
	}
}
