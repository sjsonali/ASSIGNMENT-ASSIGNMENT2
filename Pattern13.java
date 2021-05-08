class Pattern13
{
	public static void main(String args[])
	{
		char alpha=65;

		for (int i=5;i>=1;i--)
			{

				for (int k = 1;k<i;k++)
				{
				System.out.print(" ");
				}
				for (int j=5;j>=i;j--)
				{
				System.out.print((char)(alpha) +" ");
				}
				alpha++;
				System.out.println();
			}
	}
}