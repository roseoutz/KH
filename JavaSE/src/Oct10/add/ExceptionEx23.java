package Oct10.add;

import java.io.File;

public class ExceptionEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch(Exception e){
			System.out.println("Exceptted by Main Method");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exceptted by Method1");
			throw e;
		}
	}

}
