package patterns;

public class R 
{
	public static void main(String[] args) 
	  {
		  int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if((j==3)|| ((i==1) && (j>=n/2+1)) || ((j==5) && (i<=n/2+1)) || ((i==3) && (j>=n/2+1)) || ((i==j) && (i>=n/2+1)))
						{
					        System.out.print("*");
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
