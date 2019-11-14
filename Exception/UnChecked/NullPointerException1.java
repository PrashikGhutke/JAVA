class NullException
{
	int x = 10 ;
	public static void main(String args[])
	{try
		{
		NullException obj = null ;
		
		System.out.println("X = "+obj.x);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
	