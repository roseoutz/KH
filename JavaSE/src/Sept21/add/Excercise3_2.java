package Sept21.add;

public class Excercise3_2 {
	public static void main(String[] args)
	{
		int numOfApple = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (int)Math.ceil((double)numOfApple / sizeOfBucket);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
}
