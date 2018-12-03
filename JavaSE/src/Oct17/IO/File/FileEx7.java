package Oct17.IO.File;

import java.io.*;
import java.util.*;

public class FileEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage : java fileEx7 pattern");
			System.exit(0);
		}
		
		String currdir = System.getProperty("user.dir");
		
		File dir = new File(currdir);
		final String pattern = args[0];
		
		String[] files = dir.list(new FilenameFilter() {
			public boolean accpet(File dir, String name) {
				return name.indexOf(pattern)!=-1;
			}
		});
		
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i]);
		}
	}

}
