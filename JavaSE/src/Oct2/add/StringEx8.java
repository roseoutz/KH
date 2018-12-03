package Oct2.add;

public class StringEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String[] numbers = {"1","2","3","4","5"};
	String result1 = "";
	int result2 = 0;
	
	for(int i=0; i<numbers.length;i++)
	{
	result1 += numbers[i]; //String Type으로 문자열 더하
	result2 += Integer.parseInt(numbers[i]);//int형으로 숫자더하
	}
	
	System.out.println("result1 = " + result1);
	System.out.println("result2 = " + result2);
	}
}
