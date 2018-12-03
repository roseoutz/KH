package Oct2;

class StringEx1 {
	public static void main(String[] args)
	{
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1==s2)
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지않다");
		}
		
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		
		if(s3==s4)
			System.out.println("s3 == s4");
		else
			System.out.println("s3!=s4");
	}
}
