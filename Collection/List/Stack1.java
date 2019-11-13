import java.util.* ;
class Stack1
{
	public static void main(String args[])
	{
		Stack obj = new Stack();
		obj.add("ABC");
		obj.add("DEF");
		System.out.println(obj);
		for(int i = 1 ; i<=10 ;i++)
		{
			obj.push(i);
		}
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(obj.push("PRASHIK"));
		System.out.println(obj.push("PRAS"));
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.search(15));
		System.out.println(obj.search(8));
		System.out.println(obj.empty());
	
		System.out.println(obj);
		
		System.out.println(obj.empty());
		
	}
}