package Oct11;


import static java.lang.System.out;
import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"java", "beans","java","xml"};
		
		HashSet<String> hash1 = new HashSet<String>();
		HashSet<String> hash2 = new HashSet<String>();
		
		for(String n : str)
			if(!hash1.add(n))
				hash2.add(n);

		out.println("Hash1 : " + hash1);
		hash1.removeAll(hash2);
		out.println("Hash1 : "+hash1);
		out.println("Hash2 : "+hash2);
	}

}
