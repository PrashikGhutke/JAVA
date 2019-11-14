class ArrayIndex
{
	public static void main(String args[])
	{
		//ArrayIndex obj = new ArrayIndex();
		
		int a[] = { 1 ,2,3,4,5};
		for(int i = 0 ;i<a.length ;i++)
		System.out.println(a[i]);
		
		System.out.println(a.length);
		try
		{
		a[5] = 10 ;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	
	}
}