package Utill_Package;

import java.util.Arrays;
import static java.lang.System.out;

public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] ar = {"fill()","in","the","Arrays"};
	
	Arrays.fill(ar,  "SunAe");
	for(String n : ar)
		out.print(n+",");
	
	out.println("\n---------------------");
	Arrays.fill(ar, 1, 3, "Heart");
	for(String n : ar)
		out.print(n+",");
	}
}
