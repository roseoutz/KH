package Octp1.Static;

class BlockTest {

	static {
		System.out.println("Static { }");
		
	}
	
	{
		System.out.println("{ }");
		
	}
	
	public BlockTest()
	{
		System.out.println("생성자");
	}
	
	public static void main(String[] args)
	{
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
	}
}
