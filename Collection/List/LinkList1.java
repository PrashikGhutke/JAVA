import java.util.*;
class LinkList1
{
	public static void main(String artgs[])
	{
	LinkedList<String> obj = new LinkedList(); //Default 10 Element Capacity

	obj.add("ABC");
	obj.add("ABC");
	obj.add("DEF");//Adding object in arraylist  
	obj.add("GHI");
	obj.add("JKL");
	Iterator itr = obj.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	obj.set(1,"PRAS"); // Replace
	System.out.println(obj);
	obj.removeLast();
	System.out.println(obj);
	obj.addLast("MNO");
	obj.addFirst("JKL");
	System.out.println(obj);
	obj.removeFirst();
	System.out.println(obj);
	System.out.println(obj.getFirst());
	System.out.println(obj.getLast());
	}
}
	
