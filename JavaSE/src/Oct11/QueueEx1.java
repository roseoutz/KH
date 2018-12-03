package Oct11;

import static java.lang.System.out;

import java.util.LinkedList;

public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] item = {"소나타","렉스톤","제규어"};
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item)
			q.offer(n);
			out.println(q.size());
		
		String data = "";
		while((data = q.poll()) != null)
			out.println(data + "Delete");
		
		out.println("q size is : "+q.size());
	}

}
