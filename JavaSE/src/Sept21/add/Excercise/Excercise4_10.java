package Sept21.add.Excercise;

public class Excercise4_10 {
	public static void main(String[] args)
	{
		int num = 12345;
		int sum = 0;
		
		while(num!=0)
			{
				sum+=num%10;
				num=num/10;
				System.out.println("1회차 = "+sum);
				System.out.println("1회사 = "+num);
			}
		System.out.println(sum);
	}
}
