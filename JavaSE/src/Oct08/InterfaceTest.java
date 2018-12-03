package Oct08;

class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().methodA(new B());
		//A a = new A();
		//B b = new B();
		//a.methodA(b);
	}

}
