class Star10
{
	public static void main(String args[])
	{ 	
		
		for(int i=5;i>=1;i--)
		{	
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=5;j++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}
}