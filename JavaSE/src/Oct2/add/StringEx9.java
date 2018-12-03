package Oct2.add;

public class StringEx9 {
	public static void main(String[] args)
	{
		String fullname = "Hello,.java";
		
		// fullname 에서 '.'의 위치를 찾음
		int index = fullname.indexOf('.');
		// fullname의 첫글짜부터 .이 존재한 곳까지 문자열 추
		String filename = fullname.substring(0, index);
	     // '.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
		// fullName.substring(index+1, fullName.length());의 결과와 같다.
		String ext = fullname.substring(index+1);
		
		System.out.println(fullname+"확장자제외는"+filename);
		System.out.println(fullname+"확장자는"+ext);
	}
}
