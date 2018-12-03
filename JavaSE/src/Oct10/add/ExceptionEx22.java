package Oct10.add;

import java.io.*;

public class ExceptionEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"File is generated");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"retry ");
		}
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""));
		throw new Exception("FileName doesnt exist");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
