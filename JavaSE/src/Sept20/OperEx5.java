package Sept20;
//산술 논리 연산
class OperEx5{
	public static void main(String[] args){
		int a = 10;
		int b = 20;

		boolean c = ((a+=12) > b)&&(a==(b+=2));
		          //   22      20   22  22
		
		System.out.println("c="+c);

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}