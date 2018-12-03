package Oct17.IO.Byte;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/donggyukim/Desktop/test.txt", true);
			String message = "Hello FileOutputStream!!";
			fos.write(message.getBytes());
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
