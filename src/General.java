
public class General {
	public static void main(String s[])
	{
		int total=0;
		for(int i=0;i<10;i++)
		{
			System.out.println(total=total+1);
		}
	}
}
/*public static void main(String s[])
{
	int t1=0,t2=1,t3,num=10;
	for(int i=2;i<num;++i)
	{
		t3=t1+t2;
		System.out.print(t3);
		t1=t2;
		t2=t3;
	}
}
}*/
	 /*abstract class Bike{
		    void run() {
			}
		 }

		 class General extends Bike{
		 void run(){System.out.println("running safely..");}

		 public static void main(String s[]){
			 General obj = new General();
		  obj.run();
		 }
		 }*/
	
	/*public static void main(String s[])
	{
		String str= "how to do in java";
		StringBuilder reverseString=new StringBuilder();
		String[] words=str.split(" ");
		
		for(String word:words)
		{
			String rev=new StringBuilder(word).reverse().toString();
			reverseString.append(rev + " ");
		}
		System.out.println(reverseString);//.toString().trim());
	}}*/
	
	
	/*public static void main(String s[])
	{
		String st="Great to see you";
		String a[]=st.split(" ");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");	
		}
		System.out.println(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}*/

