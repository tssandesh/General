
import java.time.format.ResolverStyle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Rev {
public static void main(String args[])
{
	String s= "hi hello how are you";
	String st=s.replaceAll("\\s", "");
	String temp="";
	//"abcdecdh";//"Hi hello how are you";
	//int max=0;
		//int i,length;
		//int length=s.length();
		
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    //char c[] = s.toCharArray();
	 //char maxappearchar = ' ';

    for (char ch : st.toCharArray()) {
        if (map.containsKey(ch)) {
           int count = map.get(ch);
            map.put(ch, count + 1);
        } else {
            map.put(ch, 1);
    }
}
System.out.println(map);
//String reverse=new StringBuffer(s).reverse().toString();
//System.out.println(reverse);

//System.out.println(st.chars().distinct().count());

/*int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap    
for (Entry<Character, Integer> entry : map.entrySet())

{  
    if (entry.getValue()==maxValueInMap)
    {
    	System.out.println("the max char  "+ entry.getKey()+ "  displays"+ maxValueInMap);
       // System.out.println("the max char is : " + entry.getKey() + "  and displayed  " +maxValueInMap+ "  times");     // Print the key with max value
        //maxappearchar = entry.getKey();
    }

}*/

    //First repeated character
    //String reverString=new StringBuffer(s).reverse().toString();


    /*for(char ch:s.toCharArray())
    {
    	//max=Math.max(max,map.get(ch));
    	//System.out.println(max);
		if(map.get(ch)>1)
    	{
			
    		System.out.println(ch);
    		break;
    	}
    }*/
    
    //Last non repeated char
    /*String reverString=new StringBuffer(s).reverse().toString();
    for(char ch: reverString.toCharArray())
    //for(int i=s.length()-1;i>=0;i--)
    {
    	if (map.get(ch) == 1) {
            System.out.println(ch);
            break;
    }
    }*/
    //1st non repeated char
    /*for (char ch : s.toCharArray()) {
        if (map.get(ch) == 1) {
           System.out.println(ch);
           break;
        }
        
    }*/
}}

	
	/*Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	char c[]=s.toCharArray();
	for(char ch:c)
	
	{
		//ch=str.charAt(ch);
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
	
	for(char ch:c)
	{
		if (map.get(ch) == 1);
		{
			System.out.println(ch);
			break;
		}
	
	}

}
}
*/