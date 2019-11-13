import java.util.*;
class ArrayList1
{
	public static void main(String args[])
	{
	ArrayList<String> obj = new ArrayList();//Creating arraylist
	obj.add("ABC");
	obj.add("DEF");//Adding object in arraylist  
	obj.add("GHI");
	obj.add("JKL");
	
	Iterator itr = obj.iterator();//Traversing list through Iterator  
	//	public boolean hasNext()	
	//It returns true if the iterator has more elements otherwise it returns false.
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	obj.remove(2);
	System.out.println(obj);
	/*while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	obj.add(2,"GHIK");
	System.out.println(obj);
	
	
}
}
	
	
	

