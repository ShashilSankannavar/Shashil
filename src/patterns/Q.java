package patterns;

public class Q 
{
  public static void main(String[] args) 
  {
	 int n=5;
	 for(int i=1; i<=n; i++ )
	 {
		 for(int j=1; j<=n; j++)
		 {
			 if((i==1)&&(i<=n/2+2) || (i==n/2+2) && (j<=n/2+2) || (j==n/2+2)&&(i<=n/2+2) ||(i==1)&&(j<=n/2+2) || (i==j)&&(j<n/2))
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
