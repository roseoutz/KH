package Thread;

public class Excercise12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1 = new Thread2();
		t1.run();
		
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
	}

}

class Thread2 extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
	}
}