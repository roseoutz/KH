package Oct17.IO.Byte;
import java.io.*;
public class DataOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("/Users/donggyukim/Desktop/test.txt");
			dos = new DataOutputStream(fos);
			dos.writeBoolean(false);
			dos.writeInt(20000);
			dos.writeChar('T');
			dos.writeDouble(290.45);
			
			fis = new FileInputStream("/Users/donggyukim/Desktop/test.txt");
			dis = new DataInputStream(fis);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
				if(dis!=null)dis.close();
				if(dos!=null)dos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
