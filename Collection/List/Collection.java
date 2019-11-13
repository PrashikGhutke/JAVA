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
	public String toString()
	{
		return "Name"+this.name+"\nAGE = "+this.age+"\nSalary"+this.sal ;
	}
	@Override
	public boolean equals(Object obj)
	{
		Emp temp = (Emp) obj ; // DownCasting
		if( !( obj instanceof Emp) ) //Checks oBJECT OF SAME CLASS OF NOT
		{
			return false;
		}
		if(this.name.equals(temp.name) &&
			this.age.equals(temp.age) &&
			this.sal.equals(temp.sal)
			)
			{
				return true;
			}
			return false;
		
	}
	
	
	@Override
	public int hashCode()
	{
		int val = 9 ;
		val = val * name.hashCode();
		System.out.println("NAME = "+name.hashCode());
		val = val * age.hashCode();
		System.out.println("AGE = "+age.hashCode());
		val = val * sal.hashCode();
		System.out.println("SAL = "+sal.hashCode());
		return val ;
	/*	IF WE Didn't OverRide THe hashCode() Method at That Time It Shows Different Value 
		for obj having same data 
	*/
	}
	
	
}
class Collection
{
	public static void main(String... args)
	{
	Emp obj = new Emp("ABC",23,1000000);
	EMP obj2 = new Emp("ABC",23,1000000);
	Integer i = new Integer(10);
	Emp obj1 = new Emp();
	System.out.println("PARAMETERIZED \n: "+obj); //Prints the hashCode of The Object
//	System.out.println("INTEGER : "+i);	
	System.out.println(obj.equals(obj1));
	
	System.out.println(" ASSIGNING OBJECT");
	obj1 = obj ;
	System.out.println(obj.equals(obj1));
	
	System.out.println("OBJECT 1 EMP = "+obj.hashCode());
	System.out.println("OBJECT 2 EMP = "+obj2.hashCode());
	
	
	
	
	
	}
}

/*
OUTPUT
PARAMETERIZED
: NameABC
AGE = 23
Salary1000000.0

false
 ASSIGNING OBJECT
true


*/