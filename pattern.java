//Write a program to print following output
/*
1
12
123
1234
*/
class pattern
{
	public static void main(String s[])
	{
		for(int row=1; row<=4; row++)
			{
				for(int col=1; col<=row; col++)
				{
					System.out.print(col);
				}
				System.out.print("\n");
			}
	}
}
