package Oct18.IO.Scanner;

import java.util.*;
public class ScannerConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("insert :");
		
		Scanner scan = new Scanner(System.in);
		
		
		String number = scan.next();
		System.out.printf("Scan : %s",number);
		scan.close();
	}

}
