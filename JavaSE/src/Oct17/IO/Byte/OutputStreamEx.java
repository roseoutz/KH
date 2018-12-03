package Oct17.IO.Byte;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		OutputStream out = null;
		try {
			ps = System.out;
			out = (OutputStream)ps;
			int first ='A';
			int second = 'B';
			out.write(first);
			out.write(second);
			out.flush();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(out!=null)out.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
