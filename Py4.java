class Py4
{
	public static void main(String args[])
	{	int r,n;
		int sum=0;
		for (int i = 1 ; i<=9;i++)
		{	
			for(int k = 8;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for (int j= 1;j<=i;j++)
			{

			
				System.out.print(j);
				
			}
			for (int j= i-1;j>=1;j--)
			{

			
				System.out.print(j);
				
			}
				System.out.println();

		}
		
	
		
		
	}
}