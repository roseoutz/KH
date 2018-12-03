package ArrExample;

public class Excercise5_5 {
	public static void main(String[] args)
	{
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20
		for(int x=0; x<20; x++)
		{
			int i = (int)(Math.random()*ballArr.length);
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			//배열 ballArr에 담긴 값 중 무작위 2개의 위치를 바꾸기 위해서
			//ballArr의 값 2개를 tmp에 담아 서로 swap
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
						
		}
		//배열ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i=0;i<ball3.length;i++)
		{
			System.arraycopy(ballArr, 0, ball3, 0, ball3.length);			
			System.out.print(ball3[i]);
		}
	}
}
