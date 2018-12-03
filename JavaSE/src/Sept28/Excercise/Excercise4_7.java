package Sept28.Excercise;

public class Excercise4_7 {
	public static void main(String[] args)
	{
		int i = 0;
		
		while(i<30) 
		{
		int value = (int)(Math.random()*6 +1);
		System.out.println(i+"nd "+"value = "+value);
		i++;
		}
	}
}
