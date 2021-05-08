class HollowPy
{
	public static void main(String args[])
	{	
		for (int i = 1; i <= 6; i++)   
		{  
			for(int k = 1;k<6;k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= 11; j++)  
			{  
				if(i==1&&j==6||i==2&&j==5||i==2&&j==7||i==3&&j==4||i==3&&j==8||i==4&&j==3||i==4&&j==9||i==5&&j==2||i==5&&j==10||i==6&&j==1||i==6&&j==3||i==6&&j==5||i==6&&j==7||i==6&&j==9)
				{
				System.out.print("*"+" ");  
				}
				else 
				{
					System.out.print(" ");  

				}
				
			}  
				System.out.println();  
		} 

		
	}
}
