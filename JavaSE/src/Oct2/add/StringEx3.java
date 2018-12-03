package Oct2.add;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AAA";
		String s2 = new String("AAA");
		
		if(s1==s2)
		{
			System.out.println("s1==s2 ? ture");
		}
		else
		{
			System.out.println("s1==s2 ? false");
		}
		
		s2 = s2.intern();
		System.out.println("In s2,After call intern()");
		if(s1==s2)
		{
			System.out.println("s1==s2 ? true");
		}
		else
		{
			System.out.println("s1==s2 ? false");
		}
		
	}

}
