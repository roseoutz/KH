package Sept20;

public class OperEx9 {
	public static void main(String[] agrs)
	{
		int a = 10;
		int b = 15;
		String s = "크다";
		
		s += (++a >= b) ? (a-b)+ "만큼 a" : (b-a)+"만큼 b";
		
		System.out.println(s);
		/*
		 if (++a>=b)
		 {
		 	Sysytem.out.println(s+(a-b)+"만큼 a");
		 }
		 else
		 {
		 	System.out.println(s+(b-a)+"만큼 b");
		 }
		 */
	}
}
