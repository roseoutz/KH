package Oct2;
import java.util.StringTokenizer;
class StringTokenEx2{
	StringTokenizer st;
	
	public StringTokenEx2(String str){
		System.out.println("str : " + str);
		st = new StringTokenizer(str); // Default is tab/space/enter
	}
	public StringTokenEx2(String str, String delim){
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}

	public void print(){
		System.out.println("Token count : " + st.countTokens());
		while(st.hasMoreElements()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args)
	{
		StringTokenEx2 st1 = new StringTokenEx2("Happy day");
		st1.print();
		StringTokenEx2 st2 = new StringTokenEx2("2018/10/02","/");
		st2.print();
	}
}

