package Sept21.add.Excercise;

public class Excercise4_11 {
	public static void main(String[] args)
	{
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=0;i<8;i++)
		{
			num3=num1+num2; //num3 = 2
			
			num1 = num2;
			num2 = num3;
			//결과값 앞으로 땡기면서 피보나치 수열을 만들어간
			System.out.println(num3);
		}
	}
}
