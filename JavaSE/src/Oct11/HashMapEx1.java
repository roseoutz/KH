package Oct11;
import java.util.*;
public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("castello", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("input ID / PW .");
			System.out.println("ID : ");
			String id = s.nextLine().trim();
			
			System.out.println("Password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("no exist ID.");
				continue;
			}
			else
			{
				if(!(map.get(id)).equals(password)) {
					System.out.println("Password is wrong");
				} else {
					System.out.println("Login");
					break;
				}
			}
		}
	}
}
