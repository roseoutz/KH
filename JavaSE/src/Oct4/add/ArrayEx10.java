package Oct4.add;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50}};
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("no  kor  eng  math  total  avg");
		System.out.println("==============================");
		
		for(int i=0;i<score.length;i++)
		{
			int sum = 0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(" "+ (i+1) + " ");
			
			for(int j=0;j<score[i].length;j++)
			{
				sum+=score[i][j];
				System.out.print(score[i][j]+ "	  ");
			}
			System.out.println(sum+" "+ sum/(float)score[i].length);
		}
		System.out.println("==============================");
		System.out.println("총점 : "+ korTotal+" "+engTotal+ " "+mathTotal);
		}
	}


