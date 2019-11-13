//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;
import java.lang.* ;
class Emp implements Comparable<Emp>
{
	/* Wrapper Classes */
 
 String name;
 Integer age;
 Double sal;

	Emp()
	{}
	Emp(String name, Integer age , Double sal )
	{
		
		this.name = name ;
		this.age = age ;
		this.sal = sal ;
	}
	
	@Override
	public boolean equals(Object obj ) // WHEN THE OBJECT IS INSERTING THE DUPLICATE VALUES
	{
		System.out.println("EQUALS");
		Emp temp = (Emp) obj ;
		if( !( obj instanceof Emp ))
		{
			return false;
		}
		if( 
			this.name.equals(temp.name) &&
			this.age.equals(temp.age) &&
			this.sal.equals(temp.sal)
			)
			{
				return true ;
			}
			return false;
	}
	@Override
	public int hashCode() // CALLED WHEN THE OBJECT IS CREATED
	{
		System.out.println("HASHCODE");
		int val = 5 ;
		
		val = val * name.hashCode() ;
		val = val * age.hashCode() ;
		val = val * sal.hashCode() ;
		return val ; 
	}
	@Override 
	public String toString()
	{
		System.out.println("STRING CALLED SO" );
		return "NAME = "+this.name+"\nAGE = "+this.age+"\nSAL = "+this.sal ;
	}
	
	@Override 
	public int compareTo(Emp e )
	{
		System.out.println("HELLO COMPARE");
		//return this.name.compareTo(e.name) ;
	return this.name.compareTo(e.name) ;
	
	}
	
}
class DemoJ
{
	public static void main(String args[])
	{
		//HashSet<Emp> obj = new HashSet<>();
	//	TreeMap<Emp> obj = new TreeMap <> ();
		Emp e1 = new Emp("A",23,100000.00);
		Emp e2 = new Emp("B",25,100000.00);
		Emp e3 = new Emp("C",22,100000.00);
		Emp e4 = new Emp("D",23,100000.00);
		
		
		TreeMap<Integer,Emp> tmap = new TreeMap<>();
		tmap.put(3, e3);
		tmap.put(2, e2);
		tmap.put(1, e1);
		System.out.println(tmap);
		
	//	TreeMap<Integer, Emp> copy = (TreeMap<Integer, Emp>)tmap.headMap(21);
		/*
		obj.put(e4);
		obj.put(e3);
		obj.put(e2);
		obj.put(e1);
		*/
		
		System.out.println(tmap.get(3));
		System.out.println(tmap);
		//System.out.println(e1.equals(e4));
		
	}
}