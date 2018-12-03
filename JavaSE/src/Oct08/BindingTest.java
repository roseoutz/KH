package Oct08;

public class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent5 p = new Child5();
		Child5 c = new Child5();
		
		System.out.println(p.x);
		p.method();
		System.out.println(c.x);
		c.method();
	}

}

class Parent5{
	int x= 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child5 extends Parent5 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}