class A
{
public void m1()
{
	System.out.println("Parent Class");
}
}
class B extends A{
	public void m2()
	{
		System.out.println("Child Class");
	
	}
}
class C extends B
{
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("Hello OverRide");
		int a =5, b=5 ;
		
	}
	public void m3()
	{
		System.out.println("C Class ");
	}

}

class SuperMethod{
	
	public static void main(String args[])
	{
	C obj =  new C();
	obj.m1();
	//obj.m2(); COmpile Time Check , COmpiler Checks Only References . So, obj is a Reference obj of
	// class A . In class A, m2() is not Present.
	obj.m2();
	//obj.m3();
	
	
}
}
