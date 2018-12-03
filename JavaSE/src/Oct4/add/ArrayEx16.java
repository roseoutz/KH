package Oct4.add;
import javax.swing.*;

public class ArrayEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random() * 100) +1;
		int input = 0;
		String tmp = "";
		int count = 0;
		
		do {
			count++;
			tmp = JOptionPane.showInputDialog("Inser between number "
					+ "1~100 and when fin input -1 ");
			
			if(tmp==null || tmp.equals("-1"))
				break;
			
			System.out.println("input : " +tmp);
			
			input = Integer.parseInt(tmp);
			
			if(answer>input)
			{
				System.out.println("input bigger");
			} else if (answer<input) {
				System.out.println("input smaller");
			} else {
				System.out.println("congraturation");
				System.out.println("you tried "+count);
				break;
			}		
		}	while(true);
	}
}
