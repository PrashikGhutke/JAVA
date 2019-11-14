class ArithMetic
{
	int i = 10 ;
	public static void main(String args[])
	{
		ArithMetic obj = new ArithMetic();
	try{
		System.out.println(obj.i/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	
	
	
	
	
	}
}