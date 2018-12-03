package Sept21.add.Excercise;

public class Excercise4_2 {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<21;i++)
		{
			if(i%2!=0 && i%3!=0)
				System.out.println(i);
				sum +=i;
		}
		
		System.out.println(sum);
	}
}
