package Oct18.IO.Charactor;

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/donggyukim/Desktop/test.txt",true);
			String message = "안녕하세요 filewriter 테스트%n";
			fw.write(message);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fw!=null) 
					fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
