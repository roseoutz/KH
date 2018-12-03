package Thread;

public class Excercise12_7 {
	
	static boolean stopped = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5 th1 = new Thread5();
		th1.start();
		
		try {
			Thread.sleep(6*1000);
		} catch (Exception e) {
			stopped = true;
			System.out.println("stopped");
		}
	}
}

class Thread5 extends Thread {
	public void run() {
		//Exercise12_7.stopped 의 값이 false인 동안 반복
		
		for(int i=0;!Excercise12_7.stopped;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3*1000);
			} catch(Exception e) {}
		}
	}
}
