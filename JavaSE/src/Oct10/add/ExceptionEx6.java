package Oct10.add;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 발생");
			throw e;
		} catch (Exception e) {
			System.out.println("Error Message : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program is endded");
	}

}
