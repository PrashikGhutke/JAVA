class MyThread implements Runnable
{
	public void run()
	{
		for(int i =1;i<=20 ;i++)
		{
			System.out.println(" Hello " );
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class ThreadInterface1
{
	public static void main(String args[])
	{
		MyThread obj = new MyThread(); // ITs Not Thread Object . It IS OBJECT_NOT_EXIST
		
		// If We Have To Create a Thread Then USE THREAD CLASS
		
		Thread t1 = new Thread(obj);  //New 
		t1.setName("FIRST THREAD" );
		t1.start();
		
		Thread t2 = new Thread(obj);
		t2.setName("SECOND THREAD" );
		t2.start() ;
	}
}
		