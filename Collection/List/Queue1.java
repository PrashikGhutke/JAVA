import java.util.*;
class Queue1
{
	public static void main(String args[])
	{
	PriorityQueue obj = new PriorityQueue();
	obj.add("ABC");
	obj.add("DEF");
		obj.add("KLM");
		obj.add("GHI");
	//	obj.addElement("KLM");
		System.out.println(obj);
		System.out.println(obj.element());  // HEAD
		System.out.println(obj.peek()); // HEAD
		
		Iterator itr = obj.iterator();
		System.out.println("ITERATOR");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		obj.remove(); // delete The Element
		System.out.println(obj);
		obj.poll();// delete The Element
		System.out.println("After Deleteing Two Element");
		
		System.out.println(obj);
		
		

	}
}