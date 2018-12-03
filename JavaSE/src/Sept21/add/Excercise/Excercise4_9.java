package Sept21.add.Excercise;

public class Excercise4_9 {
	public static void main(String[] args)
	{
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i <str.length(); i++)
		{
			sum+=Character.getNumericValue(str.charAt(i));
			//Charter.getNumericValue = Ascii Value convert to int
		}
		System.out.println("Sum = "+sum);
	}
}
 