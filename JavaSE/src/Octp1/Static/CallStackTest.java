package Octp1.Static;

class CallStackTest {
	public static void main(String[] args)
	{
	//클래스명.변수
	//클래스명.메서드
	//동일 클래스에서 static 메서드에서 호출받을때ㅔ는
	//변수,메서드명을 그대로 사용해서 호출한다.
	firstMethod();
	}
	
	static void firstMethod()
	{
		secondMethod();
	}
	
	static void secondMethod()
	{
		System.out.println("secondMethod");
	}
}
