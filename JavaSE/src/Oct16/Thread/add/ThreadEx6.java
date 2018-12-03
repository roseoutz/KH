package Oct16.Thread.add;

import javax.swing.*;

public class ThreadEx6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	String input = JOptionPane.showInputDialog("input any number");
	System.out.println("input number is " + input);
	
	for(int i=10;i>0;i--) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
	}
	}

}
