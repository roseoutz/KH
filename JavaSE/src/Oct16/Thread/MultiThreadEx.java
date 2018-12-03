package Oct16.Thread;

public class MultiThreadEx implements Runnable {
	public void run() {
		int first = 0;
		int second = 0;
		for(int i=0;i<20;i++) {
			first++;
			second++;
			System.out.printf("First : %d,",first);
			System.out.printf("Second : %d,",second);
			System.out.printf("Thread Name : %s%n",
					Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadEx srt1 = new MultiThreadEx();
		Thread firstThread = new Thread(srt1,"1st Thread");
		firstThread.start();
		MultiThreadEx srt2 = new MultiThreadEx();
		Thread SecondThread = new Thread(srt2,"2nd Thread");
		SecondThread.start();
	}

}
