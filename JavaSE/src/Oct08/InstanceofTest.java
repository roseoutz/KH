package Oct08;

public class InstanceofTest {
	public static void main(String args[])
	{
		FireEngine2 fe = new FireEngine2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("this is a fireengine instance");
		}
		
		if(fe instanceof Car5) {
			System.out.println("this is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("this is an Object instance");
		}
	}
}

class Car5{}
class FireEngine2 extends Car5 {}
