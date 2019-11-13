import java.util.*;
class Enumeration1
{
	public static void main(String args[])
	{
	Vector obj = new Vector();
	for(int i = 1 ;i<= 20; i++)
	{
		obj.add(i);
	}
	System.out.println("NorMAL= "+obj);
	
	Enumeration en = obj.elements();
	
	while(en.hasMoreElements())
	{
		Integer i=(Integer)en.nextElement();
		if(i%2 == 0 )
		System.out.println(en.nextElement());
		
	}
	
	}
	
}