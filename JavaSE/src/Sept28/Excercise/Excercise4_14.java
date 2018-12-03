package Sept28.Excercise;
import java.util.Scanner;

public class Excercise4_14 {
	public static void main(String[] args)
	{
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			count++;
			System.out.print("Insert to Between 1 from 100 : \t");
			input = s.nextInt();
			
			if(input>answer)
			{
				System.out.println("Input Smaller");
			} 
			else if(input<answer) 
			{
				System.out.println("Input Bigger");
			}else {
				System.out.println("Conguraturation! u r try to "+count+"times");
				break;
			}
			
		} while(true);
	}
}
