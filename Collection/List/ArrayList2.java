import java.util.ArrayList;
import java.util.Iterator;
import java.util.* ;
class Emp
{
	/* Wrapper Classes */
private String name;
private Integer age;
private Double sal;

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
		if(this.name.equals(temp.name) &&
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
		System.out.println("STRING CALLED");
		return "NAME = "+this.name+"\nAGE = "+this.age+"\nSAL = "+this.sal ;
	}
}
class ArrayList2
{
	public static void main(String args[])
	{
		HashSet<Emp> obj = new HashSet<>();
		
		Emp e1 = new Emp("A",23,100000.00);
		Emp e2 = new Emp("B",23,100000.00);
		
		obj.add(e1);
		obj.add(e2);
		//obj.add(e3);
		//System.out.println(obj.add(e4));
		System.out.println(obj);
		//System.out.println(e1.equals(e4));
		
	}
}