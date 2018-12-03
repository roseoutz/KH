package Octp1.Static;

class MemberCall {
	int iv = 10; //맴버변
	static int cv = 20; // 클래스변수
	
	int iv2 = cv;
	// static int cv2 = iv is error 클래스 변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용가능
	//MemberCall mc = new MemberCall() ==> mc.iv
	
	static void staticMehtod1()
	{
		System.out.println(cv);
		//system.out.println(iv) Error instance Method can't use in Class Method
		MemberCall c = new MemberCall();
		System.out.println(c.iv); //After make the instance, can reference
	}
	
	void instanceMethod1()
	{
		System.out.println(cv);
		System.out.println(iv); //인스턴스메서드에서는 인스턴스변수를 바로 사용가능.
	}
	
	static void staticMethod2()
	{
		staticMethod1(); // Error. Class Method에서는 Instance Method 를 호출할 수 없음.
		MemberCall c = MemberCall();
		c.instanceMethod1(); //인스턴스를 생성한 후에야 호출할 수 있
	}
	
	void instanceMethod2() // in instance method, can use instance method and class method
	{
		staticMethod1(); // 모두 인스턴스 생성없이 호출 가능하다
		instanceMethod1();  
	}
	
	
	
}
