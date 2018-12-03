package Utill_Package;

import java.util.*;
import static java.lang.System.out;

public class ArraysEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar1 = {"fill()","in","the","Arrays"};
		String[] ar2 = {"fill()","in","","Arrays"};
		
		if(!Arrays.equals(ar1, ar2))
			out.println("Two Array is now eqauls");
		out.println("---------------------------");
		
		Arrays.fill(ar2, 2,3,"the");
		if(!Arrays.equals(ar1, ar2))
			out.println("Different");
		else
			out.println("Same");
	
	}

}
