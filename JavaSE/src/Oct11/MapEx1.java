package Oct11;

import static java.lang.System.out;
import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] msg = {"Berlin","Dortmund","Frankfurt","Gelsenkirchen","hamburg"};
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		for(int i=0;i<msg.length;i++)
			map.put(i, msg[i]);
				
		Set<Integer> keys = map.keySet();
		for(Integer n : keys)
			out.println(map.get(n));
	}

}
