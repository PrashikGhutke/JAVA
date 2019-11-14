class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("THREAD CLASS ONE " );
		for(int i = 1 ; i<=15 ;i++)
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread Class Two " );
		for(int i = 1 ;i <= 20 ;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class ThreadInterface2
{
	public static void main(String args[])
	{
		MyThread obj = new MyThread(); // OBJCET
		
		Thread t1 = new Thread(obj); // THread Object Refering run() of Object
			t1.start();
			t1.setName("THREAD CHILD" );
			
		MyThread1 obj1 = new MyThread1() ;  // THread Object Refering run() of Object
		
		Thread t2 = new Thread(obj1) ;
		t2.start();
	}
}
		
		
		