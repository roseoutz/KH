package Oct16.Thread;

import java.awt.event.*;
import javax.swing.*;

public class MultiThreadProgressEx extends JPanel implements ActionListener
{

	private JProgressBar progressbar1, progressbar2;
	private JButton startButton;
	
	public MultiThreadProgressEx() {
		startButton = new JButton("Start");
		startButton.addActionListener(this);
		progressbar1 = new JProgressBar(0,1000);
		progressbar2 = new JProgressBar(0,1000);
		
		progressbar1.setValue(0);
		progressbar1.setStringPainted(true);
		progressbar2.setValue(0);
		progressbar2.setStringPainted(true);
		
		JPanel panel = new JPanel();
		panel.add(startButton);
		panel.add(progressbar1);
		panel.add(progressbar2);
		add(panel);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}
	
	public void actionPerformed(ActionEvent evt) {
		startButton.setEnabled(false);
		ProgressBarThread p1 = new ProgressBarThread(progressbar1, startButton);
		ProgressBarThread p2 = new ProgressBarThread(progressbar2, startButton);
		p1.start();
		p2.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("MultiThreadProgressEx");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	MultiThreadProgressEx pdb = new MultiThreadProgressEx();
	frame.add(pdb);
	frame.pack();
	frame.setVisible(true);
	}

}

class ProgressBarThread extends Thread{
	private JProgressBar jpb;
	private JButton jb;
	public ProgressBarThread(JProgressBar jpb, JButton jb) {
		this.jpb = jpb;
		this.jb = jb;
	}
	public void run() {
		int current = 0;
		while(current <= 1000) {
			current += Math.random()*100;
			jpb.setValue(current);
		}
		try {
			sleep(100);
		} catch(InterruptedException e) {
		}
		jb.setEnabled(true);
	}
}
