package Oct16.Thread;

public class SingleThreadEx extends Thread {
	
	private int[] temp;
	public SingleThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start=0;start<temp.length;start++)
		{
			temp[start] = start;
		}
	}
	
	public void run () {
		for(int start : temp) {
			try {
				sleep(200);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("쓰레드 이름 : %s,",currentThread().getName());
			System.out.printf("temp value : %d%n",start);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SingleThreadEx st = new SingleThreadEx("First");
	st.start();
	SingleThreadEx st2 = new SingleThreadEx("Second");
	st2.start();
	}

}
