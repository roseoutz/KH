package Oct08;

interface InterTest{
	static final int a = 100;
	abstract int getA(); // abstract method
}

public class InterTestEx implements InterTest
{
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterTestEx it1 = new InterTestEx();
		System.out.println("getA() : " + it1.getA());
	}

}
