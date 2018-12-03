package Oct18.IO.Charactor;

import java.io.*;

public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("/Users/donggyukim/Desktop/test.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWrite 테스트입니다.");
			bw.newLine();
			bw.write("안녕하세요" + System.getProperty("line.sperator"));
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fw!=null)fw.close();
				if(bw!=null)bw.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
