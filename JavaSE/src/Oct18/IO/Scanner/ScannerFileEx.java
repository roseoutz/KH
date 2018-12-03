package Oct18.IO.Scanner;

import java.io.*;
import java.util.*;

public class ScannerFileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = null;
		try {
			scan = new Scanner(new File("/Users/donggyukim/Desktop/IO/VM Fusion License"));
			while (scan.hasNextLine()) {
				System.out.printf("Scan : %s",scan.next());
			}
			scan.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(scan!=null)
				scan.close();
		}
	}

}
