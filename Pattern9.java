class Pattern9
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			char alpha=65;

			for (int k= 5;k>i;k--)
			{
			System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
			System.out.print((char)(alpha)++ +" ");
			}
			System.out.println();
		}
	}
}