import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Map.Entry;


public class Runtime implements Comparable<Runtime>
{
private String name;
private int age;
private int rollno;

public Runtime(String name,int age,int rollno)
{
	this.name=name;
	this.age=age;
	this.rollno=rollno;
}

public String getname()
{
	return name;
}

public int getage()
{
	return age;
}

public int getrollno()
{
	return rollno;
}


public void setname(String name)
{
	this.name=name;
}
public void setrollno(int roolno)
{
	this.rollno=rollno;
}

public void setage(int age)
{
	this.age=age;
}


/*public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return this.getname().compareTo(((Runtime)o).getname());
	//return this.getage().compareTo(((Runtime)o).getage());
	}*/

//@Override
public int compareTo(Runtime r) {
	// TODO Auto-generated method stub
	if(rollno==r.rollno)
		return 0;
	else if(rollno>r.rollno)
	return 1;
	else
		return -1;
	
	//return this.getage().compareTo(((Runtime)o).getage());
	}

//@Override
/*public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}*/


}



/*public class Runtime
{
	static double salary=99.9;
	int age=45;
	
	public static void display()
	{
		System.out.println("display");
	}
	void great()
	{
		System.out.println("great");
	}
public static void main(String s[])
{
	//System.out.println(age);
	System.out.println(salary);
	display();
	Runtime r=new Runtime();
	r.great();
}

}*/
	/*public static void main(String s[])
	{
		int a[]={1,2,3,4,2,4,3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&& (i!=j))
						{
					System.out.println(a[j]);
						}
			}
		}
	}
}*/
	/*public static void main(String s[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		num.replaceAll("\\s", "");
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch: num.toCharArray())
		{
			if(map.containsKey(ch))
			{
			 int value=map.get(ch);
			 map.put(ch, value+1);
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
		
		String reverse=new StringBuffer(num).reverse().toString();
		for(char ch:reverse.toCharArray())
		{
			if(map.get(ch)>1)
			{
				System.out.println(ch);
				break;
			}
		}
		int maxvalue=Collections.max(map.values());
		for (Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==maxvalue)
			{
				System.out.println("the max char  " + entry.getKey()+ "displays  " + maxvalue);
			}
		}
		
		
	}
}*/
	
	/*public static void main(String s[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=factorial(num);
		System.out.println(result);
	}
	public static int factorial(int num) {
		if(num!=0)
		{
			return(num*factorial(num-1));
		}else
		{
		return 1;
		}
		
	}
}*/
	
	
	/*public static void main(String s[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		recursion(num);
	}
	
	public static void recursion(int n)
	{
		if(n<=10)
		{		System.out.println(n);
		recursion(n+1);
		}
	}*/

	
		//int num,m,fact,rev=0;
/*String rev="";
String str; 
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("reverse string is"+ rev);*/
		
		/*if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palin");
		}*/
		
		/*while(num!=0)
		{
			fact=num%10;
			rev=rev*10+fact;
			num=num/10;
		}
		
		System.out.println("no reversed "+ rev);*/
		/*if(rev==m)
		{
			System.out.println("palindrome");
		
		}
		else
		{
			System.out.println("not palindrome");
		}*/



/*public static void main(String s[]) throws Exception
{
	FileReader fis=new FileReader("F:\testout.txt");
	int i;
	while((i=fis.read())!=-1)    
          System.out.print((char)i);    
          fis.close();  
}*/








/*class Runtime  extends Compile
{
 public void Sound()
 {
	 System.out.println("bark");
 }
 
 public static void main(String s[])
 {
	 Compile a=new Runtime();
	 a.Sound();
 }
}*/

 /*class Run 
{
	void bark()
	{
		System.out.println("great");
	}
	
}

 class Let
{
	void bark()
	{
		System.out.println("great");
	}
	s
}

 class Runtime extends Run,Let
{
public static void main(String s[])
{
	Runtime r=new Runtime();
	r.bark();
}
}*/


/*class GrandParent
{
    void fun()
    {
        System.out.println("Grandparent");
    }
}*/
 
// First Parent class
/*class Parent1 extends GrandParent
{
    void fun()
    {
        System.out.println("Parent1");
    }
}
 
// Second Parent Class
class Parent2 extends GrandParent
{
    void fun()
    {
        System.out.println("Parent2");
    }
}*/
 
 
// Error : Test is inheriting from multiple
// classes
/*class Runtime extends Parent1, Parent2
{
   public static void main(String args[])
   {
	   Runtime t = new Runtime();
       t.fun();
   }
}*/
