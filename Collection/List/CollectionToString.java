class Emp
{
	/* Wrapper Classes */
private String name;
private Integer age;
private double sal;

	Emp()
	{}
	Emp(String name, Integer age , double sal )
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
}
class CollectionToString
{
	public static void main(String... args)
	{
	Emp obj = new Emp("ABC",23,1000000);
	Integer i = new Integer(10);
	Emp obj1 = obj;
	System.out.println("PARAMETERIZED \n: "+obj); //Prints the hashCode of The Object
//	System.out.println("INTEGER : "+i);	
	System.out.println("COPY DATA" );
	System.out.println("DATA COPIED:\n "+obj1);
	}
}

/*
OUTPUT
PARAMETERIZED
: NameABC
AGE = 23
Salary1000000.0

COPY DATA
DATA COPIED:
 NameABC
AGE = 23
Salary1000000.0
*/