package Oct4;

public class objArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Youn-A","Love","Youn-Seo"};
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		for(String s : arr) //개선된 루
			System.out.println(s);
			
	}

}
