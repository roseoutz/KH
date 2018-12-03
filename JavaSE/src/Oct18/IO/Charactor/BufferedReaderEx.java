package Oct18.IO.Charactor;

import java.io.*;
public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("/Users/donggyukim/Desktop/Java/Sample/JavaSE/src/Oct17/IO/Byte/FileInputStreamEx.java");
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine())!=null) {
				System.out.println(msg);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
