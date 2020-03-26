package newpackage;



public class Threads
{
	
public class first implements Runnable
{	
	public void run()
	{
		System.out.println("test");
	}
}
	
public class second implements Runnable
{
    public void run()
	{
		System.out.println("new");
	}
}

public static void main(String[] args)
	{
	    Threads up = new Threads();
		first obj = up.new first();
		second obj1 = up.new second();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		t1.start();
		t2.start();
	
	}


}