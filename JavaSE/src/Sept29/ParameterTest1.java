package Sept29;

class Data
{
	int x;
	
	static void change(int x)
	{
		x = 1000;
		System.out.println("change() : x = "+ x);
	}
}
class ParameterTest
{
	public static void main(String[] args)
	{
		Data d = new Data();
		d.x = 10;
		System.out.println("Main() : x = " + d.x);
		
		Data.change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x  );
	}
}
