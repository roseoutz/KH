package Sept20;

//비교연산
class OperEx4{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		boolean c = a < b; //���� a�� ���� b���� �۴�.
		System.out.println("a < b :" + c);
		
		c = (a <= b); 
		System.out.println("a <= b :" + c);
		
		c = (a > b); 
		System.out.println("a > b :" + c);
		
		c = (a >= b); 
		System.out.println("a >= b :" + c);
		
		c = (a == b); 
		System.out.println("a == b :" + c);

		c = (a != b); //���� a�� ���� b�� ���� �ʴ�.
		System.out.println("a != b :" + c);
	}
}


