package Sept28.Excercise;

public class Excercise4_6 {
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6;j++)
			{
				sum=i+j;
				if(sum==6)
				{
					System.out.println(i+"++"+j);
				}
			}
		}
	}
}
