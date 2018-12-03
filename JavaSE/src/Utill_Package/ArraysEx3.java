package Utill_Package;

import java.util.*;
import static java.lang.System.out;

public class ArraysEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {6,3,7,2,1};
		
		Arrays.sort(ar1);
		
		for(int n : ar1)
			out.print(n+",");
	}

}
