package Utill_Package;

import java.util.Random;
import static java.lang.System.out;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] lesson = {"Java Beg", "JSP", "XML&JAVA","EJB"};
	Random r1 = new Random();
	
	int index = r1.nextInt(4);
	
	out.println("선택과목" + lesson[index]);
	}

}
