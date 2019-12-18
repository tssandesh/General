public class Abst
{
	public static void main(String s[])
	{
		int a[]={ 5, 34, 78, 2, 45, 1, 99, 23};
			int one=0,two=0;
			for(int i=0;i<a.length;i++)
			{
				if(one<a[i])
				{
					two=one;
					one=a[i];
				}
				else if(two<a[i])
				{
					two=a[i];
				}
			}
		  		System.out.println(one);
		  		System.out.println(two);
	}
	}
	/*{
		int a[]={1,2,3,4,5,6};
		System.out.println(gettop(a,6));
		
	}

	private static int gettop(int[] a, int total) {
		int temp;
		
		// TODO Auto-generated method stub
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
		}
			
		}
		return a[total-1];
		
	}
		
		
		
		public class SecondLargestInArrayExample{  
public static int getSecondLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+getSecondLargest(a,6));  
System.out.println("Second Largest: "+getSecondLargest(b,7));  
}}  


public static int getSecondLargest(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(total-2);  
return element;  
}  
public static void main(String args[]){  
Integer a[]={1,2,5,6,3,2};  
Integer b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+getSecondLargest(a,6));  
System.out.println("Second Largest: "+getSecondLargest(b,7));  
}}  
	
}*/




/*public class Abst implements Banking
{

	public static void main(String s[])
	{
		
	}
	@Override
	public void Creditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Transfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Balance() {
		// TODO Auto-generated method stub
		
	}
	
	public void group()
	{
		System.out.println();
	}
}*/


/*abstract class Abs {
	public abstract void color();
	public abstract void type();
	public void groups()
	{
		System.out.println("g");
	}}
	
	class Abst extends Abs
	{
		
		

		@Override
		public void color() {
			// TODO Auto-generated method stub
			System.out.println("gr");
		}

		@Override
		public void type() {
			// TODO Auto-generated method stub
			System.out.println("gr");
		}
	
		public static void main(String s[])
		{
			
			Abst obj=new Abst();
			obj.groups();
			obj.color();
			obj.type();
		}
		
	}*/
		
		
		
	


