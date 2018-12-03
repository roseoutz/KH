package Sept28.Excercise;

public class Excercise4_15 {
	public static void main(String[] args)
	{
		int number = 96369;
		int tmp = number;
		
		int result = 0;
		
		while(tmp!=0)
		{
			result=result*10+tmp%10;
			tmp/=10;
			
			System.out.println(result);
			System.out.println(tmp);
			
		}
		
		if(number==result)
			System.out.println(number + "회문수 입니다.");
		else
			System.out.println(number + "회문수가 아닙니다.");
	}
}
