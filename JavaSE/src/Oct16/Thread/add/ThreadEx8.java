package Oct16.Thread.add;

import javax.swing.*;

public class ThreadEx8 {
	static boolean inputCheck = false;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
	}

}

class ThreadEx8_1 extends Thread{
	public void run() {
		System.out.println("inpit in 10 Seconds");
		String input = JOptionPane.showInputDialog("Insert any number");
		ThreadEx8.inputCheck = true;
		System.out.println("input number is : "+input);
	}
}

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i=9;i>=0;i--) {
			if(ThreadEx8.inputCheck) return;
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch(InterruptedException e) {
			}
		}
	}
}