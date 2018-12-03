package Octp1.Static;

public class StaticTest1 {
	int a;
	static String s;
	
	public static void main(String[] args)
	{
		s = "Java's Dream";
		
		StaticTest1 st1 = new StaticTest1();
		
		//a=1000;
		st1.a = 1000;
		System.out.println(s);
	}
}
