package Octp1;

class OverloadingTest1 {

	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : "+s.length());
	}
	public void floatLength(float f) {
		String s = String.valueOf(f);
		System.out.println("입력한 값의 길이 : "+s.length());
	}
	public void stiringLength(String str) {
		System.out.println("입력한 값의 길이 : "+str.length());
	}
	public void intLength(String[] args) {
		OverloadingTest1 ot1 = new OverloadingTest1();
		
		ot1.intLength(1000);
		ot1.floatLength(3.14f);
		ot1.stiringLength("10000");
	}
}

