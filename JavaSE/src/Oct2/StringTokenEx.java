package Oct2;
import java.util.StringTokenizer;

public class StringTokenEx {
	
	public static void main(String[] args)
	{
		System.out.println("Split Test::::::::::::");
		String date = "2018/10/02";
		String[] sp = date.split("/");
		for(int i=0;i<sp.length;i++)
			System.out.println("sp["+i+"] : "+sp[i]);
		
		System.out.println("StringTokenizer Test ::::::::::");
		StringTokenizer st = new StringTokenizer(date,"/");
		int index = 0;
		while(st.hasMoreElements())
		{
			String token = st.nextToken();
			System.out.println("st"+index+" : "+token);
			index++;
		}
	}
}
