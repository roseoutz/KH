package Octp1.Static;

class Product {
	static int count = 0;
	int serialNum;
	
	{
		
		++count;
		serialNum = count;
	}
	
	public Product() {}
	

}

class ProductTest
{
	public static void main(String args[])
	{
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1's Serial number is "+ p1.serialNum);
		System.out.println("p2's Serial number is "+ p2.serialNum);
		System.out.println("p3's Serial number is "+ p3.serialNum);
		System.out.println("All of product is "+Product.count+"EA" );
	}
}