import java.util.*;
class HashSet1
{
	public static void main(String args[])
	{
	HashSet obj = new HashSet(); // Default Capacity = 16 AND LOAD FACTOR = .75
	obj.add("ABC");
	obj.add("DEF");
		obj.add("KLM");
		obj.add("GHI");
	System.out.println(obj);
	
	//NUL IS ADDED ONLY ONCE
	//INSERTION ORDER NOT PRESERVED
	//DUPLICATES ENTRY NOT ALLOW NOT SHOW ANY ERROR BT RETURNS FALSE
	System.out.println(obj.add("ABC"));

	obj.add(null);
	System.out.println(obj.add(null));
	}
}
	
