package Oct4;

public class objArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t1 = {1,100};
		int[] t2 = {20,200,2000,20000};
		
		int[][] test = new int[2][];
		
		test[0] = t1;
		test[1] = t2;
		//    test[0]     test[1]
		//       l              l
		//    1,100       20,200,2000,20000
		for(int i=0;i<test.length;i++)
		{
			for(int j=0;j<test[i].length;j++)
			System.out.println("test["+i+"]["+j+"]:"+test[i][j]);
			System.out.println("-----------------");
		}
	}

}
