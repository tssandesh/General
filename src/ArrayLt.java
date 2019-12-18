import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayLt 
{
public static void main(String s[])
{
	HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
	  
    // Mapping int values to string keys 
    hash_map.put("Geeks", 10); 
    hash_map.put("4", 15); 
    hash_map.put("6", 20); 
    hash_map.put("Welcomes", 25); 
    hash_map.put("You", 30); 

    // Displaying the HashMap 
    System.out.println("Initial Mappings are: " + hash_map); 

    
    // Using keySet() to get the set view of keys 
    System.out.println("The set is: " + hash_map.keySet());
    
    ArrayList<String>list=new ArrayList<>();
    System.out.println(list.addAll(hash_map.keySet()));
    System.out.println(list.get(0)+list.get(1));
    
	
	/*int a[]={4,5,4,5,4,5,2,9,2};
	ArrayList<Integer> al=new ArrayList<Integer>();
	for (int i=0;i<a.length;i++)
	{
		int k=0;
		if(!al.contains(a[i]))
		{
			al.add(a[i]);
			
			for (int j=1;j<a.length;j++)
			{	
				if(a[i]==a[j])
				{
					k++;
				}
			}
			System.out.println(a[i]);
			System.out.println(k);
			if(k==1)
				System.out.println(a[i]+"unique no");*/
		}
		
	
	
	//}
	
	

 /*ArrayList<String> ar=new ArrayList<String>();
 ar.add("Usa");
 ar.add("India");
 ar.add("UK");
 ar.add("Japan");
 ar.add("Japan");
 System.out.println(ar);
 System.out.println(ar.contains("Japan"));
 System.out.println(ar.get(2));*/
	
	/*HashSet<String> hr=new HashSet<String>();
	hr.add("Usa");
	 hr.add("India");
	 hr.add("UK");
	 hr.add("Japan");
	 hr.add("Japan");
	 //System.out.println(hr);

Iterator<String> it=hr.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}*/

	/*HashMap<Integer, String> hm=new HashMap<Integer,String>();
	hm.put(0, "Usa");
	hm.put(1, "India");
	hm.put(2, "japan");
	hm.put(3, "Russia");

	System.out.println(hm.get(3));
System.out.println(hm.remove(3));
System.out.println(hm.get(3));

Set sn=hm.entrySet();
Iterator it=sn.iterator();
while(it.hasNext())
{
	
	Map.Entry mp=(Map.Entry)it.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
}*/

	
	
	


}
//}
