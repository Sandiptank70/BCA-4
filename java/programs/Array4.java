/*
	Jagged Array / Ragged Array

		1 	2	3	4

		5	6

		7	8	9
*/

class Array4
{
	public static void main(String arg[])
	{
		int arr[][] = {
				{1, 2, 3, 4},
				{5, 6},
				{7, 8, 9}
			      };
		int a, b;

		for(a=0;a<arr.length;a++)
		{
			for(b=0;b<arr[a].length;b++)
			{
				System.out.print("\t" + arr[a][b]);
			}
			System.out.println("\n");
		}
	}
}
