package Oct10.add;

public class ExceptionEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		} catch(ArithmeticException ae) {
		System.out.println("Exception Message : " +ae.getMessage());
		}
		System.out.println(76);
		
	}

}
