package pro_LEVEL;

public class coinRemoval {
	public static void main(String args[])
	{
		char[][] matrix = {{'T', 'H', 'H'},
				           {'T', 'H', 'T'},
				           {'T', 'H', 'H'}};
		
		try
		{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(matrix[i][j]=='H')
				{
					matrix[i][j]='_';
					if(matrix[i+1][j]=='T')
					{
						matrix[i+1][j]='H';
						if(matrix[i+2][j]=='T')
						{
							matrix[i+2][j]='H';	
						}
					}
				}
			}
		}
		}catch (Exception e)
		{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
			}
		}
				           
	}

}
