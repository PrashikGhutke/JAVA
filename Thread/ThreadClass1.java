class MyThread extends Thread
{
	public void run()    // SHARABLE RUN METHOD TO ALL OBJECTS
	{
		for(int i = 1 ;i <= 15 ;i++)
		{
			
		System.out.println("Welcome Thread"); 
		System.out.println(Thread.currentThread().getName()+" ===> "+i ); 
		
		}
	}
}
class ThreadClass1
{
	public static void main(String args[]) // Main Thread Call this main()
	{
		MyThread t1 = new MyThread() ; // T1 Thread Is Created , New State
		
		t1.start();  // For New To Runnable 
		
		t1.setName("Child" ); // Set The NAme Of THread
	
		//t1.start() ; //IllegalThreadStateException Occurs , Below COde IS NOt Executed
		
		MyThread t2 = new MyThread();
		
		t2.start();
		t2.setName("CHILD PART TWO");
		
		System.out.println("MAIN THE END ");
	}
}
		