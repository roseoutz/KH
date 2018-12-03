package Sept28.Excercise;

public class Excercise4_3 {
	public static void main(String[] args)
	{
		int sum = 0;
		int total = 0;
		
		for(int i=0;i<=10;i++)
		{
			sum += i;
			total += sum;
		}
		System.out.println(total);
	}
}
