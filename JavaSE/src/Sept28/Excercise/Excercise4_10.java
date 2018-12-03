package Sept28.Excercise;

public class Excercise4_10 {
	public static void main(String[] args)
	{
		int num = 12345;
		int sum = 0;
		/*
		do
		{
			sum += num%10;
			num /=10;
			if(sum==15)
				break;
		}while(true);
	*/
		for(int i=0;true;i++)
		{
			sum+=num%10;
			num/=10;
			if(sum==15)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
