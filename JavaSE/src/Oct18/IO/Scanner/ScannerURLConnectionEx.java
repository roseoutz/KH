package Oct18.IO.Scanner;

import java.util.*;
import java.io.IOException;
import java.net.*;

public class ScannerURLConnectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLConnection urlCon = null;
		Scanner scan = null;
		
		try {
			urlCon = new URL("https://okky.kr/article/512297").openConnection();
			scan = new Scanner(urlCon.getInputStream());
			scan.useDelimiter("\\Z");
			String text = scan.next();
			System.out.println(text);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(scan!=null) scan.close();
		}
	}

}
