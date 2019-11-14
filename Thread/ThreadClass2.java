class MyThread extends Thread
{
	public void run()
	{
		
		for(int i =1;i<=20 ;i++)
		System.out.println(" MERA THREAD MAHAN " );
	}
}
class MyThread1  extends Thread 
{
	public void run()
	{
		for(int i =1;i<=20 ;i++)
		System.out.println(" CODER MAN ");
	}
}
class ThreadClass2  // WHen Class Is Loaded Main Thread Created
{
	public static void main(String args[]) // Main THread Call main()
	{
		MyThread t1 = new MyThread();  //t1 THread Created @ New SATATE
		
		t1.start();  //New ----->>>>> Runnable
		
		MyThread1 t2 = new MyThread1() ; // t2 Thread Created @ New State
		 
		t2.start();
		
	}
}
		
		