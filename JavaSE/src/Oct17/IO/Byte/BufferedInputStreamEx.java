package Oct17.IO.Byte;

import java.io.*;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("/Users/donggyukim/Desktop/Java/Sample/JavaSE/src/Oct17/IO/File/FileEx");
			bis = new BufferedInputStream(fis);
			int readbyte = 0;
			while((readbyte = bis.read())!= -1) {
				System.out.print((char)readbyte);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
				if(bis!=null) bis.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
