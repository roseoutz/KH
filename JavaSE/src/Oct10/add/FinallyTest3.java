package Oct10.add;

public class FinallyTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyTest3.method1();
		System.out.println("After working Method1(), return main Method");
	}

	static void method1() {
		try { 
			System.out.println("Called method1()");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Starting method1() by finally Block");
		}
	}
}
