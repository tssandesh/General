import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Problems {
	
	
	public static void main(String s[])
	{
		ArrayList<Runtime>list=new ArrayList<>();
		list.add(new Runtime("sandesh", 30, 101));
		list.add(new Runtime("Mahesh", 20, 99));
		list.add(new Runtime("Rahul", 50, 103));
		
		Collections.sort(list);
		
		for(Runtime r: list)
		{
			System.out.println(r.getname()+ " "+ r.getage()+ " " + r.getrollno());
		}
		
	}
}
	/*public static void main(String s[])
	{
		String rev="";
		String str="The world is welcome";
		int length=str.length();
		
		for(int i=length-1;i>0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		int num,rev=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	}*/
		/*System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();//"MISSiSSIPPI";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(char ch: str.toCharArray())
	{
		if(map.containsKey(ch))
		{
			int value=map.get(ch);
			map.put(ch, value+1);
		}
		else
		{
			map.put(ch, 1);
		}
	}
	System.out.println(map);
	}
	}*/
	
	/*public static int subclass(Integer[] a,Integer total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
			}
		}}
		return a[total-2];
	}*/

	/*Integer a[]={1,2,3,4,5,6};
			System.out.println(subclass(a,6));*/
			
			//Object o[]={1,3,5,"san","ram"};
			
			/*HashMap<String, Integer>map=new HashMap<String, Integer>();
			map.put("san",1);
			map.put("ram",3);
			System.out.println(map.get("san")+map.get("ram"));*/

