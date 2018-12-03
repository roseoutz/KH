package Sept21.add.Excercise;

public class Excercise4_6 {
	public static void main(String[] args)
	{
		int d1 = 0;
		int d2 = 0;
		int sum = 0;
		
		for(d1=1;d1<7;d1++)
		{
			for(d2=1;d2<7;d2++)
			{
				sum = d1 + d2;
				if(sum==6)
				{
					System.out.println("Dice1 ="+d1+"Dice2="+d2+"="+sum );
				}
			}
		}
	}
}
