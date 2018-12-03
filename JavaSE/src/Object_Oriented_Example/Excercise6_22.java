package Object_Oriented_Example;

public class Excercise6_22 {
	
	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=57||str.charAt(i)<=47)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str+"is number?" +isNumber(str));
		
		str = "1234o";
		System.out.println(str+"is number?" +isNumber(str));
	}

}
