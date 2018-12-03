package Sept21.add;

public class Excercise3_8 {
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 20;
		int c = a + b;
		
		char ch = 'A';
		ch = (char)(ch + 2);
		
		float f = 3 / 2f;
		double l = 3000 * 3000 * 3000d;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = d ==f2;
		
		System.out.println("c="+c); // 30
		System.out.println("ch="+ch); // C
		System.out.println("f="+f); // 1.5
		System.out.println("l="+l); // 27000000000
		System.out.println(f2);
		System.out.println(d);
		System.out.println("result="+result); // true
	}
}
