class A
{
	private String name ;
	private Integer age;
	private Double sal ;
	
	A()
	{}
	A(String name,Integer age,Double sal)
	{
		this.name = name ;
		this.age = age ;
		this.sal = sal ;
	}
	@Override
	public int hashCode()
	{
		int val  = 9;
		//int prime =  ;
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
class CollectionHashCode
{
	public static void main(String args[])
	{
		A obj = new A("PRASHIK",23,1000.00);
		A obj1 = new A("PRASHIK",23,1000.00);
	/*
		hashCode() IS USED FOR MAKING THE UNIQUENESS 
		IF hashCode() Is OVERridden OBJECT Class Create SAME HASH CODE FOR DIFFERENT OBJECT 
		
		If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
If o1.hashCode() == o2.hashCode is true, it doesn’t mean that o1.equals(o2) will be true.
		
		*/
		A obj2 = new A("ABC",22,1000.0);
		Integer i = new Integer(10);
		Integer i1 = new Integer(10);
		//System.out.println("OBJECT I = "+obj2.hashCode());
		//System.out.println("OBJECT I1 = "+i1.hashCode());
		System.out.println("OBJECT 1 = "+obj.hashCode());
		System.out.println("OBJECT 2 = "+obj1.hashCode());
	}
	
	
}