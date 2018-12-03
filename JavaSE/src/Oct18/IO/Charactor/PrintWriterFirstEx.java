package Oct18.IO.Charactor;
import java.io.*;

public class PrintWriterFirstEx {
	public static void main(String args[]) {
	FileWriter fw = null;
	BufferedWriter bw = null;
	PrintWriter pw = null;
	try {
		fw = new FileWriter("/Users/donggyukim/Desktop/test.txt",true);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		pw.println("안녕하세요");
		pw.println("반갑습니다.");
		pw.println(100);
		pw.println(new Integer("1000"));
	} catch (IOException ioe) {
		ioe.printStackTrace();
	} finally {
		try {
			if(fw!=null)fw.close();
			if(bw!=null)bw.close();
			if(pw!=null)pw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
 }
}