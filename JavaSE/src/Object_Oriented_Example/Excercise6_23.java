package Object_Oriented_Example;

public class Excercise6_23 {

	public static int max(int[] arr) {
		if(arr==null || arr.length==0)
			return -99999;
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("Max " + max(data));
		System.out.println("max : "+max(null));
		System.out.println("Max : "+max(new int[] {}));
	}

}
