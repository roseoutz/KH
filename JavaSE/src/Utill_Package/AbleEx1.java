package Utill_Package;

import static java.lang.System.out;
import java.util.*;

public class AbleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector<Able> v = new Vector<Able>(2,5);
	
	Able a1 = new Able("B123",90,75,70);
	Able a2 = new Able("T723",60,90,80);
	Able a3 = new Able("A427",85,80,80);
	Able a4 = new Able("G533",90,90,60);
	v.addElement(a1);
	v.addElement(a2);
	v.addElement(a3);
	v.addElement(a4);
	
	out.println("-----------before Sort-----------");
	for(Able n : v)
		out.println(n.empno+","+n.getTotal());
	
	Able[] a = new Able[v.size()];
	v.copyInto(a);
	AbleComp comp = new AbleComp();
	Arrays.sort(a, comp);
	out.println("------------After Sort-------------");
	
	for(Able n : v)
		out.println(n.empno+","+n.getTotal());
	}

}
