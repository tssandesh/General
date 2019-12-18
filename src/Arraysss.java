import java.util.Scanner;

public class Arraysss {

	public static void main(String s[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String orginal=sc.nextLine();
		String rev="";
		
		for(int i=orginal.length()-1;i>=0;i--)
		{
			rev=rev+orginal.charAt(i);
		}
		System.out.println(rev);
	
	/*{
		int a[][]={{2,4,5},{3,0,7},{1,2,9}};
				int max=a[1][2];
		
 for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		if(a[i][j]>max)
		{
			System.out.println(max=a[i][j]);
		}
	}
}*/
//System.out.println(min);
	}}
