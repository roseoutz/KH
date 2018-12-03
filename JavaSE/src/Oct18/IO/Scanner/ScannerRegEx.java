package Oct18.IO.Scanner;

import java.util.*;
public class ScannerRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1 and 2 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan = scan.useDelimiter("\\s*and\\s*");
		int firsttoken = scan.nextInt();
		int secondtoken = scan.nextInt();
		String thirdtoken = scan.next();
		String fourthtoken = scan.next();
		String fifthtoken = scan.next();
		System.out.printf("%d,%d,%s,%s,%s", firsttoken,secondtoken,thirdtoken,fourthtoken,fifthtoken);
		scan.close();
	}

}
