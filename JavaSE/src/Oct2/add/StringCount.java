package Oct2.add;

public class StringCount {

	private int count; //private 는 String count class 내에서만 사용가
	private String source = "";
	
	public StringCount(String source) {
		this.source = source; //생성자 생
	}
	
	public int stringCount(String s) {
		return stringCount(s, 0);
	}
	
	public int stringCount(String s, int pos) {
		int index = 0;
		if(s== null || s.length()==0)
			return 0;
		if( (index = source.indexOf(s, pos))!= -1) {
			count++; //soucre의 indexof 가 -1일 경우 찾는 값이존재하지 않는다란 의
			stringCount(s, index+s.length());
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		StringCount sc = new StringCount(str);
		System.out.println(sc.stringCount("aa",0));
	}

}
