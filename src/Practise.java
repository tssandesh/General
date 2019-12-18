/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//import com.google.common.base.Objects;

public class Practise {
	
	public static void main(String s[])
	{ 
		String []listNames={"Tom", "John", "Mary", "Peter", "David", "Alice", "Shiva", "Arun", "Peter", "John", "Mary"};
		ArrayList<String> a=new ArrayList<String>(Arrays.asList(listNames));
	    System.out.println(a);
		
	    //To remove all duplicate values
		Set<String> set=new HashSet<String>(a);
		ArrayList<String> a2=new ArrayList<>(set);
		
		//To arrange in alphabetic order
		Collections.sort(a2);
		System.out.println(a2);
		
		
		//To remove names which are not of 4 characters
	Iterator<String> it=a2.iterator();
	while(it.hasNext())
	{
		if(!(it.next().length()==4))
		{
			it.remove();
	
		}
		
	}
	System.out.println(a2);

	}
}

	public static void main(String s[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print("");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String s[])
	{
	int num=7890;
	int rev=0,fact;
	//int length=st.length();
	while(num>0)
	{
		fact=num%10;
		rev=rev*10+fact;
		num=num/10;
	}
		System.out.println(rev);
		
	}
	
	public static void main(String s[])
	{
		
		
		Set<Integer>set= new HashSet<>() ;
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(4);
		System.out.println(set);
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "san");
		map.put(2, "man");
		map.put(3, "ian");
		map.put(4, "pan");
		
		System.out.println(map);
		
		Set<Integer>set=new LinkedHashSet(map.values());
		System.out.println(set);
		Map<Integer,String>map=new HashMap<>();
		for(Integer in:list)
		{
         		map.put(in, in.toString());
		}
		System.out.println(map);	
		System.out.println(list);
		Set<Integer>set=new HashSet<>(list);
		System.out.println(set);
		list.toArray();
		for(Object obj: list.toArray())
		{
			System.out.println(obj);
		}
		
	}
	 fibonacci public static void main(String s[])
{
	int n=10,t1=0,t2=1,t3;
	System.out.print(t1+ "" +t2);
	for(int i=2;i<n;++i)
	{
		
		t3=t1+t2;
		System.out.print(""+t3);
		t1=t2;
		t2=t3;
	}
}
	
	public static void main(String s[])
	{
		int temp;
		boolean isPrime=true;
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==0||num==1)
		{
			System.out.println("number is not prime");
		}else
		{
			for(int i=2;i<num/2;i++)
			{
				temp=num%i;
				if(temp==0)
				{
					isPrime=false;
							break;
				}
			}
			if(isPrime)
		
				System.out.println("num is prime");
		
				else
				{		System.out.println("num is not prime");
			}
		}
		
	}
		
		Integer a[]={1,5,7,4,9,3};
		System.out.println(subclass(a, 6));
				
	}
	
	public static int subclass(Integer a[],int total)
	{
		ArrayList<Integer>arraylist=new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(arraylist);
		int element=arraylist.get(total-2);
		return element;
	}
	 
	
		
		
		{
			for(int i=0;i<50;i++)
			{
				
			
			if(i%3==0 && i%5==0)
			{
				System.out.println("capgemini");
			}
			if(i%3==0)
			{
				System.out.println("cap");
			}
			if(i%5==0)
			{
				System.out.println("gemini");
			}
			else
			{
				System.out.println( i);
			}
			}
		}
		{
			int number=5,result;
			result=factorial(number);
			System.out.println("factorial is" + result);
		}
			 static int factorial(int num)
			{
				if(num!=0)
				{
					return num*factorial(num-1);
				}else
				{
					return 1;
				}
				
			}
			
			
			System.out.println("enter a number");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			recursion(i);
			
		}

		public static void recursion(int i) {
			if(i<=10)
				{System.out.println(i);
				recursion(i+1);
				}
				
			
		
		
		String str,rev="";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("nonpalin");
		}
	
		int m,rev=0,num,fact;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		m=num;
		
		while(num>0)
		{
			fact=num%10;
			rev=rev*10+fact;
			num=num/10;
		}
		
		if(rev==m)
		{
			System.out.println("palindrome");
		}
			else
			{		System.out.println("nonpalin");
		}
		
	}

*/