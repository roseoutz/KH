package Sept28.Excercise;

public class Excercise4_4 {

	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 0;
		int s = 1;
		
		for(int i=0;true;i++)
		{
			num = s*i;
			sum+=num;
			s=-s;
			if(sum>=100)
			{
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
