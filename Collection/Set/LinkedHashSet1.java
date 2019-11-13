import java.util.*;
class LinkedHashSet1
{
//INSERTION ORDER PRESERVED CACHE APPLICATION USED

	public static void main(String args[])
	{
	LinkedHashSet obj = new LinkedHashSet(); 
	obj.add("ABC");
	obj.add("DEF");
		obj.add("KLM");
		obj.add("GHI");
	System.out.println(obj);
	
	//NULL IS ADDED ONLY ONCE
	
	//DUPLICATES ENTRY NOT ALLOW NOT SHOW ANY ERROR BT RETURNS FALSE
	System.out.println(obj.add("ABC"));

	obj.add(null);
	System.out.println(obj.add(null));
	
	System.out.println(obj);
	}
}
	
