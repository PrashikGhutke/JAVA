import java.lang.reflect.* ;

class Demo 
{
	int x;
	int y;
	
	void m1()
	{
		System.out.println(" M1" );
	}
	void m2(int x)
	{
		System.out.println(" M2" );
	}
	private void m3()
	{
			System.out.println(" M3" );	
	}
}

class ReflectionAPI
{
	public static void main(String args[]) throws Exception
	//ClassNotFoundException,InstantiationException,IllegalAccessException
	{
		
		Class c = Class.forName("Demo");
		
		Method methods[] = c.getDeclaredMethods();
		
		for(Method m : methods )
		{
			System.out.println(m.getName());
		}
		
		Constructor[] constr = c.getDeclaredConstructors();
		
	for( Constructor co : constr )
		{
			System.out.println(co.getName());
		}
		
	
	Demo obj =  (Demo) c.newInstance();
	Method m = c.getDeclaredMethod("m1");
	m.invoke(obj); // For Invoking Method
	
	Method n = c.getDeclaredMethod("m2",int.class);
	n.invoke(obj,10); // For Invoking The Method
	
	Method  p = c.getDeclaredMethod("m3");
	p.setAccessible(true);
	p.invoke(obj);
	}
}
	
	
	
	
	

		
		