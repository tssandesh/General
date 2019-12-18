
/*public interface Banking
{
public void Creditcard();
public void Transfer();
public void Balance();
}*/

public class Banking
{
	private int id;
	private  String name;
	private int age;
	
	
	public int  getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	
	}
	public int getage()
	{
		return age;
		
	}
	
	public void setid(int ide)
	{
		id=ide;
	}
	public void setname(String namee)
	{
		name=namee;
	}
	public void setage(int agee)
	{
		age=agee;
	}
	
	public static void main(String s[])
	{
		Banking bn=new Banking();
		bn.setage(22);
		bn.setid(1);
		bn.setname("gambir");
		
		System.out.println(bn.getname());
		System.out.println(bn.getage());
		System.out.println(bn.getid());
		
		
	}
}

