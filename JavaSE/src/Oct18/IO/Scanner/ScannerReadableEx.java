package Oct18.IO.Scanner;

import java.util.*;
import java.io.*;

public class ScannerReadableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = null;
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/donggyukim/Desktop/IO/VM Fusion License");
			scan = new Scanner(fr);
			
			while(scan.hasNext()) {
				System.out.printf("Scan : %s %n", scan.next());
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			if(scan!=null) scan.close();
		}

	}

}
