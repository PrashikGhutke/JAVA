class A
{
	int x ;
	A(int a)
	{
		System.out.println(x);
		System.out.println("Parent Class Constructor");
	}
	
	public void m1()
	{
	System.out.println("Parent Class");
	}
}

class B extends A{
	
	B()//int a
	{	
		super(1);
		System.out.println("Child Class Constructor");
	}
	
	public void m2()
	{
		System.out.println("Child Class");
	}
}
class C extends B
{
	C(int b)
	{
		//super(10);
		System.out.println("Child C Class Constructor"+b);
	}
	public void m3()
	{
		System.out.println("C Class ");
	}
}
class ConstTest{
	
	public static void main(String args[])
	{
	C obj =  new C(101);
	//obj.m1();
	//obj.m2();
	}
}
