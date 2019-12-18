
 class Animal
{
	void Animal()
	{
		System.out.println("Animal");
	}
}

 class Superr extends Animal
{
	
	void Sup()
	{
		super.Animal();
		System.out.println("Dog");
	}


	public static void main(String s[])
	{
		Superr obj=new Superr();
		obj.Sup();
	}
}
