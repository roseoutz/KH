package Oct10.add;

import java.io.*;

public class ExceptionEx21 {
	public static void main(String[] args)
	{
		File f = createFile(args[0]);
		System.out.println(f.getName()+"file is generated");
	}
	
	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("File name error");
		} catch (Exception e) {
			fileName = "Unamed.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f)
	{
		try {
			f.createNewFile();
		} catch (Exception e) {}
	}
}
