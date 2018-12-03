package Oct10.add;

import java.io.*;
import java.util.Date;


public class ExceptionEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("Error.log",true);
			ps = new PrintStream(fos);
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(Exception ae) {
			System.out.println("-------------------");
			System.out.println("Error Time : "+new Date());
			ae.printStackTrace(System.err);
			System.out.println("Error MEssage : "+ae.getMessage());
			System.out.println("-------------------");
		}
		System.out.println(6);
	}

}
