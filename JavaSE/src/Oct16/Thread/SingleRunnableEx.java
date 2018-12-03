package Oct16.Thread;

public class SingleRunnableEx implements Runnable {
	private int temp[];
	public SingleRunnableEx() {
		temp = new int[10];
		for(int start=0;start<10;start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(200);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("Thread name is : %s, ", Thread.currentThread().getName());
			System.out.printf("Temp Value is : %d%n",start);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SingleRunnableEx srt = new SingleRunnableEx();
	Thread t = new Thread(srt,"First");
	t.start();
	SingleRunnableEx srt2 = new SingleRunnableEx();
	Thread t2 = new Thread(srt2,"Second");
	t2.start();
	}

}
