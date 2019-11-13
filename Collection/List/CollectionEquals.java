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
	public boolean equals(Object obj)
	{
		A temp = (A) obj ;
		if( !(obj instanceof A))
		{
			return false ;
		}
		if(this.name.equals(temp.name) &&
			this.age.equals(temp.age) &&
			this.sal.equals(temp.sal) )
			{
				return true;
			}
			return false;
			
		
	}
}
class CollectionEquals
{
	public static void main(String args[] )
	{
	A obj1 = new A("PRASHIK",23,10000.00);
	A a1 = new A();
	System.out.println(obj1.equals(a1));
	
	
	System.out.println("OBJECT ASSIGNED COPIED");
	
	a1 = obj1 ;
	System.out.println(obj1.equals(a1));
	
	
	
	}
}
	