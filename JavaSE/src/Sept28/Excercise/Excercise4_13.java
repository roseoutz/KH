package Sept28.Excercise;

public class Excercise4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "120p34";
		char ch = ' ';
		boolean isNumber = true;
		
		//반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		
		for(int i=0; i<value.length() ; i++)
		{
			ch=value.charAt(i);
			System.out.println(ch);
			if(!('0'<=ch&&ch<='9'))
			{
				isNumber=false;
				break;
			}
		}
		
		if(isNumber)
		{
			System.out.println(value+" is Number");
		}
		else
		{
			System.out.println(value+" is Character");
		}
	}

}
