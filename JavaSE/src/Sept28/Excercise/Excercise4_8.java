package Sept28.Excercise;

public class Excercise4_8 {
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
				
		while(x<=10)
		{
			while(y<=10)
			{
				if(2*x+4*y==10)
				{
					System.out.println(x+"+"+y);
				}
				y++;
			}
			x++;
		}
	}
}
