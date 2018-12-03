package Oct11;
import java.util.*;
import static java.lang.System.out;

public class IteratorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>(2,5);
		
		v.add("Hyeri");
		v.add("Suji");
		v.add("Seolhyeon");
		out.println("Vector size is : " + v.size());
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			out.println(it.next());
			it.remove();
		}
		
		out.println("Size of Vector : "+v.size());
	}

}
