package Oct2;

public class StringEx5 {
	public static void main(String[] args)
	{
		String s1 = "Kwon Sun Ae";
				//   012345678910
		int index = s1.indexOf('n');
		System.out.println(index);
		
		index = s1.indexOf("sun");
		System.out.println(index);
		
		index = s1.lastIndexOf('n');
		System.out.println(index);
		
		char c = s1.charAt(index);
		System.out.println(c);
		
		//String s1 = "Kwon Sun Ae";
		
		index = s1.indexOf('S');
		String str = s1.substring(index);
		System.out.println(str);
		
		str = s1.substring(index, index+3);
		System.out.println(str);
		
		int length = s1.length();
		System.out.println(length);
		
		String[] arr = s1.split(" ");
		for(int i=0;i<arr.length;i++)
			System.out.println("arr]"+i+"] : "+arr[i]);

	}
}
