package Sept20;

public class OperEx10 {
	public static void main(String[] args)
	{
		int a = 14;
		int b = 15;
		String c = "";
		String s = "크다";
		//s = ++a >= b? c = "a가크다" : c= "b가 크다";
		s += ++a >= b ? (a==b ?"만큼 크다" :(a-b)) : (b-a);
		// s = 15 >= 15 ? (14==15 ? : -1) : 1
		System.out.println(s);
	}
}

