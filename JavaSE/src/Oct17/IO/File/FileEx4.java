package Oct17.IO.File;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class FileEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		for(int i=0;i<files.length;i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length()+"";
				attribute = f.canRead() ? "r" : " ";
				attribute += f.canWrite() ? "w" : " ";
				attribute += f.isHidden() ? " h" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n",df.format(new Date(f.lastModified())), attribute, size, name );
		}
	}

}
