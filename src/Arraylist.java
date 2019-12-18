import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Arraylist {
public static void main(String s[])
{

String str="madam";
Hashtable<Character, Integer> counter = new Hashtable<Character, Integer>();
int count = 0;
for(int i=0;i<str.length();i++){
    if(!counter.keySet().contains(str.charAt(i))){
        counter.put(str.charAt(i), 1);
    } else {
        count = counter.get(str.charAt(i));
        counter.put(str.charAt(i), ++count);
    }
}

for(char c:counter.keySet()) {
    System.out.println("Character : "+c+" - Occurences : "+counter.get(c));
}
/*{
	Object infy = null;
	Object mar = null;
	Object[] o={10,infy,20,30,mar};
	//String[] object=new String  
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(0,10);
	list.add(1);
	list.add(2,40);
	list.add(3,10);
	System.out.println(list);
	System.out.println(list.get(0)+list.get(2));
}*/
}
}
