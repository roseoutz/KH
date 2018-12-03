package ArrExample;

public class Example5_1 {
	public static void main(String[] args)
	{
		
	int[][] arr = {
			{5,5,5,5},
			{10,10,10},
			{20,20,20,20},
			{30,30}
	};
	
	System.out.println(arr.length);
	
	for(int i=0; i<arr.length;i++)
	{
		for(int j=0; j<arr[i].length;j++)
		System.out.println("arr["+i+"]+["+j+"] = "+arr[i][j]);
	}
	}
}
