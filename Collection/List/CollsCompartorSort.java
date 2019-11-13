import java.util.ArrayList;
import java.util.Collections ;
import java.util.Iterator ;
class CollsCompartorSort
{
	public static void main(String args[])
	{
	ArrayList<Integer> obj  = new ArrayList<>();

	for(int i = 15 ; i >= 1;i--)
	{
		obj.add(i);
	}

	Emp e1  =new Emp();
	obj.add(e1);
	AgeSort as = new AgeSort();
	Collections.sort(obj,as);
	Iterator itr = obj.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}