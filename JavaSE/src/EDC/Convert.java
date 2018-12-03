package EDC;

public class Convert {
	private static int a = 2;
	public static void main(String args[])
	{
		modify(a);
		System.out.println(a);
	}
	public static void modify(int b) {
		b = Convert.a;
		String[] arg = Convert.main();
		
		return b+Convert.main();;
	}
}