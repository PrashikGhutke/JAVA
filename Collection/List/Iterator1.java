import java.util.*;
class Iterator1
{
	public static void main(String args[])
	{
	Vector obj = new Vector();
	for(int i = 1 ;i<= 20; i++)
	{
		obj.add(i);
	}
	System.out.println("NorMAL= "+obj);
	
	Iterator en = obj.iterator();
	
	while(en.hasNext())
	{
		//Integer i=(Integer)en.next();
		//if(i%2 == 0 )
		System.out.println(en.next());
		
	}
		
	en.remove(); // LAST ELEMENT IS DELETED
	System.out.println(obj);
	}
	
}