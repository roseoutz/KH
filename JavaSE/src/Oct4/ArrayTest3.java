package Oct4;

public class ArrayTest3 {
	
	String imsi;
	
	public String[] swap(String[] arr)
	{
		if(arr.length==0)
			return null;
		
		imsi = arr[0];
		
		for(int i=0; i<(arr.length-1);i++)
		{
			arr[i] = arr[i+i];
		}
		
		arr[arr.length-1] = imsi;
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest3 mt3 = new ArrayTest3 ();
		
	}

}
