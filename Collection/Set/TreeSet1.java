import java.util.*;
class TreeSet1
{
	public static void main(String args[])
	{
	TreeSet<Integer> obj = new TreeSet<>();
	for(int i = 30;i>=1 ; i-- )
	{
		obj.add(i);
	}
	System.out.println(obj);
	
	TreeSet <Integer> copy = (TreeSet<Integer>) obj.headSet(20); //Head Excluding
	
	System.out.println(copy);
	
	TreeSet <Integer> copy1 = (TreeSet<Integer>) obj.tailSet(15);  //TAIL INCLUDING
		System.out.println(copy1);
	TreeSet <Integer> copy2 = (TreeSet<Integer>) obj.subSet(10,20); // SUBSET	
	System.out.println(copy2);
	}
}
