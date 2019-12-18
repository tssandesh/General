
public class Patterns {
	public static void main(String s[])
	{
		int row=5,k,i,j;
		for(i=1;i<row;i++)
		{
			for(j=i;j<row;j++)
			System.out.print(" ");
			for(k=1;k<(i*2);k++)
				System.out.print("*");
			System.out.println("\n");
			
		}
	}
}
		//int row=5,k=0;
		/*int rows=5, k,i,j;

		for(i=1;i<rows;i++)
		{
			for(j=i;j<rows;j++)
			System.out.print(" ");
			for(k=1;k<(i*2);k++)
				System.out.print("*");
			System.out.println("\n");*/
				
		/*int rows = 5, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
*/
           
			
        
		
		/*for(int i=row;i>=1;--i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<row;++i)
		{
			for(int j=0;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
	


