package Oct17.IO.File;

import java.io.*;

public class FileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=0) {
			System.out.println("Usage : java FileEx2 DIRECTORY");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists()||!f.isDirectory()) {
			System.out.println("Doesn't exists Directory");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+fileName + "]" : fileName);
		}
	}

}
