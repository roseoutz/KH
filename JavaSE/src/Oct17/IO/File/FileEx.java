package Oct17.IO.File;

import java.io.*;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "/etc/";
		File f1 = new File(filePath);
		
		String list[] = f1.list();
		for(int i=0;i<list.length;i++) {
			File f2 = new File(filePath,list[i]);
			if(f2.isDirectory()) {
				System.out.print("%s : Directory%n");
			} else {
				System.out.printf("%s : File(%,dbyte)%n",
						list[i],f2.length());
			}
		}
		File f3 = new File("/Users/donggyukim/Desktop/test.txt");
		System.out.println(f3.createNewFile());
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.getCanonicalPath());
		System.out.println(f3.getParent());
		System.out.println(f3.getName());
		File f4 = new File("/Users/donggyukim/Desktop/test.txt");
		File f5 = new File("/Users/donggyukim/Desktop/test11.txt");
		System.out.println(f4.renameTo(f5));
	}

}
