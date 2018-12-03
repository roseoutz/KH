package Oct16.Thread;

class MyRunnableOne implements Runnable{
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	public void second() {
		System.out.println("second");
	}
}

public class UncertainThreadEx {
	public static void main(String[] args)
	{
		System.out.println("Maint Start");
		Runnable r = new MyRunnableOne();
	    Thread myThread = new Thread(r);
        myThread.start();
		System.out.println("main end");
	    }
}