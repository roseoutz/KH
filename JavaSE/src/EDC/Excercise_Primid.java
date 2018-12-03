package EDC;
import java.util.Scanner;

public class Excercise_Primid {
	public static void main(String[] args)
	{
		int input = 0;
		int i = 0;
		int j = 0;
		
		
		System.out.println("몇줄의 피라미드를 생성할 것입니까?(홀수)");
		Scanner scn = new Scanner(System.in);
		if(input%2==0)
		{
			System.out.println("홀수를 입력해주세요");
		}
		else
		{
		input = scn.nextInt();
		}
		
		for(i=0;i<input;i++)
		{
			System.out.print("*");
		}
			
	}
}
