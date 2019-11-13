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
}
class CollectionTest
{
	public static void main(String... args)
	{
	Emp obj = new Emp("ABC",23,1000000);
	Integer i = new Integer(10);
	Emp obj1 = obj;
	System.out.println("PARAMETERIZED : "+obj); //Prints the hashCode of The Object
	System.out.println("INTEGER : "+i);	
	System.out.println("DEFAULT : "+obj1);
	}
}

/*
OUTPUT:

PARAMETERIZED : Emp@15db9742 
INTEGER : 10
DEFAULT : Emp@6d06d69c
*/