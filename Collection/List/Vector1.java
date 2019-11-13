import java.util.*;
class Vector1
{
	public static void main(String... args)
	{
		Vector obj = new Vector();
		System.out.println(obj.capacity());
		obj.add("ABC");
		obj.add("ABC");
		obj.add("GHI");
		obj.addElement("KLM");
		obj.add("JKL");
		for(int i = 1 ;i<=10;i++)
		{
			obj.addElement(i);
		}
		
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("CAPACITY = "+obj.capacity()); //It Increases by initialCapacity * 2 ;
	}
}