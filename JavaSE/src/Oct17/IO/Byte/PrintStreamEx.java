package Oct17.IO.Byte;

import java.io.*;

public class PrintStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream("/Users/donggyukim/Desktop/test.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true);
			ps.println("Seong young hwang");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
				if(ps!=null)ps.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
