package Oct11;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = {85, 95 ,50, 35 , 45 , 65 , 10 , 100};
		
		for(int i=0;i<score.length;i++)
		set.add(new Integer(score[i]));
		
		System.out.println("bigger than 50 number is "+ set.headSet(new Integer(50)));
		System.out.println("lower than 50 number is "+ set.tailSet(new Integer(50)));
	}

}
