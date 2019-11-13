import java.util.HashMap;
import java.lang.Comparable;
import java.util.*;
class Emp implements Comparable<Emp> 
{
	Integer id;
	String name;
	Integer age;
	Double sal ;
	 
	Emp(Integer id,String name,Integer age,Double sal)
	{
		this.id = id ;
		this.name = name ;
		this.age = age ;
		this.sal = sal ;
	}
	@Override
	public String toString()
	{
		return "ID = "+id+"NAME = "+name+"AGE = "+age+"Sal = "+sal ;
	}
	@Override 
	public boolean equals(Object o)
	{
		Emp temp = (Emp) o ;
		if( !(o instanceof Emp) )
		{
			return false;
		}
		if( this.name.equals(name) &&
			this.id.equals(id) &&
			this.age.equals(age) &&
			this.sal.equals(sal) 
			)
			{
				return true ;
			}
			return false ;
	}
	@Override
	public int hashCode()
	{
		int value = 5 ;
		value = value * id.hashCode();
		value = value * name.hashCode();
		value = value * age.hashCode();
		value = value * sal.hashCode();
		return value ;
	}
	@Override
	public int compareTo(Emp e)
	{
		return this.name.compareTo(e.name) ;
	}
}
class HashMap1 
{
	public static void main(String args[])
	{
	HashMap<Integer, Emp> obj = new HashMap<>();
	
	Emp e1 = new Emp(1,"ABC",25,10000.00);
	Emp e2 = new Emp(2,"DEF",78,10000.00);
	Emp e3 = new Emp(3,"GHI",13,10000.00);
	Emp e4 = new Emp(4,"KBC",34,10000.00);
	Emp e5 = new Emp(5,"LBC",87,10000.00);	
	
	obj.put(5,e5);
	obj.put(4,e4);
	obj.put(e1.id , e1);
	obj.put(e2.id , e2 );
	obj.put(e3.id , e3 );
	
	System.out.println(obj);
	
	Emp temp = obj.get(3);
	temp.sal = 30000.00 ;
	 //obj.get(3).sal = 40000;
	
	System.out.println(obj.get(3));
	
	//System.out.println(containsValue(e4));
	obj.remove(3);
	System.out.println(obj.get(3));
	
	}
}
	
	