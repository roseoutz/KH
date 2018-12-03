package Oct4.add;

public class ArrayEx3 {
	public static void main(String[] args)
	{
		int[] num = new int[10];
		
		for(int i=0; i<10; i++)
		{
			num[i] = i;
			System.out.print(num[i]);
		}
		
		System.out.println();
		
		for(int i=0 ; i<100 ; i++)
		{
			int n = (int)(Math.random() * 10);
			// 0-9의 난수를 temp를 통해 swap
			int temp = num[1];
			num[1] = num[n];
			num[n] = temp;
		}
		
		for(int i=0 ; i<num.length ; i++)
			System.out.print(num[i]);
	}
}
