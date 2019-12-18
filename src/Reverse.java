import java.util.Scanner;
import java.util.Arrays;

public class Reverse {
	public static void main(String s[])
	{
		
		int a[]={1,2,3,4,3,4};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println("duplicate" + a[j]);
				}
			}
		}
		
		
/*String str,rev="";
System.out.println("Enter a string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int length=str.length();

for(int i=0;i<length;i++)

{
	rev=rev+str.charAt(0);
	for(int j=length-2;j>0;j--)
	{
		rev=rev+str.charAt(j);
	}
	rev=rev+str.charAt(length-1);
	break;
	for(int j=length-2;j>=1;j--)
	{
	    	rev=rev+str.charAt(j);	
	}	
	rev=rev+str.charAt(length-1);
	break;
}
System.out.println(rev);*/
}}