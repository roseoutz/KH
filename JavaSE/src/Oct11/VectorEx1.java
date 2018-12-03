package Oct11;

import static java.lang.System.out;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector<String> v = new Vector<String>(2,5);
	
	out.println("::::::백터생서시:::::::");
	out.println("capacity : "+v.capacity() );
	out.println("size : " + v.size());
	
	v.add("Park Ji Sung");
	v.add("Park jo young");
	v.add("You Sang Chul");
	
	out.println("::::::::::요소 추가후:::::::::::::");
	out.println("capacity : "+v.capacity());
	out.println("size : "+ v.size());
	
	}

}
