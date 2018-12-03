package Octp1;

public class ThisTest {
	
	public ThisTest() {
		System.out.println("객채생성 : " + this);
		
	}
	
	public static void main(String[] args)
	{
		ThisTest tt = new ThisTest();
		System.out.println("객채생성 후 : "+tt);
	}
}
