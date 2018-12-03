package Oct17.IO.File;

import java.io.*;
import java.util.*;

public class FileEx8 {
	static int deletedFiles = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage : java FileEx8 Extension");
			System.exit(0);
		}
		
		String currdir = System.getProperty("user.dir");
		
		File dir = new File(currdir);
		String ext = "."+args[0];
		
		delete(dir, ext);
	}

	
	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		for(int i=0;i<files.length;i++) {
			if(files[i].isDirectory()) {
			delete(files[i],ext);
			} else {
				String filename = files[i].getAbsolutePath();
				
				if(filename.endsWith(ext)) {
					System.out.println(filename);
					if(files[i].delete()) {
						System.out.println(" - 삭제 성공");
						deletedFiles++;
					} else {
						System.out.println(" - 삭제 실패");
					}
				}
			}
		}
	}
}
