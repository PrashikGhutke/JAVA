import java.util.*;
class ListIterator1
{
	public static void main(String args[])
	{
		
	LinkedList obj = new LinkedList();
	obj.add("ABC");
	obj.add("ABC");
	obj.add("DEF");//Adding object in arraylist  
	obj.add("GHI");
	obj.add("JKL");
	ListIterator itr  = obj.listIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	while(itr.hasNext())
	{
	//Converted Into STRING
		String s = (String)itr.next() ;
		if(s.equals("ABC"))
		{
			System.out.println("Heloo");	
			itr.remove();
			itr.set("ABCD");
		}
	}
	System.out.println(obj);
	}
	
}