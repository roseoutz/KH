package Octp1.Static;

class StaticTest2_1{
	String s1 = "Static"; // instance
	static String s2 = "STATIC";
	
	public static String getString() {
		return s2;
	}
}
class StaticTest2 {

	public static void main(String[] args)
	{
		System.out.println("S2 : " + StaticTest2_1.getString());
	}
}
