package Oct17.IO.Byte;

import java.io.*;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("/Users/donggyukim/Desktop/test.txt");
			bos = new BufferedOutputStream(fos);
			String str = "BufferedOutputStream Test입니다  ";
			
			bos.write(str.getBytes());
			bos.flush();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
