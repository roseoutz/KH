package Oct18.IO.Charactor;

import java.io.*;

public class FileReaderEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			fr  = new FileReader("/Users/donggyukim/Desktop/Java/Sample/JavaSE/src/Oct17/IO/Byte/FileInputStreamEx.java");
			
			int readChar;
			
			while((readChar = fr.read())!=-1)
			{
				System.out.print((char)readChar);
			} 
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
			} catch (IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
