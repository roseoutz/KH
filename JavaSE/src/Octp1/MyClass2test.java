package Octp1;

class MyClass2test {

	public static void main(String[] args)
	{
		MyClass2 mc1 = new MyClass2();
		MyClass2 mc2 = new MyClass2("아라치");
		MyClass2 mc3 = new MyClass2("Maruci", 46);
		MyClass2 mc4 = new MyClass2(23, "Oh Java");
	
		System.out.println(mc1.getName()+" "+mc1.getAge());
		System.out.println(mc2.getName()+" "+mc2.getAge());
		System.out.println(mc3.getName()+" "+mc3.getAge());
		System.out.println(mc4.getName()+" "+mc4.getAge());

	}
	
}
