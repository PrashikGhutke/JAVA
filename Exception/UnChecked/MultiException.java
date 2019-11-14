class ArithMetic
{
	int i = 10 ;
	public static void main(String args[])
	{
		ArithMetic obj = new ArithMetic();
	try{
		int a[] = { 1 ,2,3,4,5};
		a[5] =10;
		System.out.println(obj.i/0);
	}
	catch(ArithmeticException| ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	
	
	
	
	
	}
}