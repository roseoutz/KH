package ArrExample;

public class Excercise5_7 {
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("USAGE : JavaExcercise5_7 3120");
			System.exit(0);
		}
	
	//문자열을 숫자로 변환한다. 입력한값이 숫자가 아닐 경우 예외가 발생한다.

	int money = Integer.parseInt(args[0]);
	
	System.out.println("money = "+money);
	
	int[] coinUnit = {500,100,50,10};
	int[] coin = {5,5,5,5};
	
	for(int i = 0; i<coinUnit.length;i++)
	{
		int coinNum = 0;
			coinNum = money/coinUnit[i];
	
			if(coinNum*coinUnit[i]==money) {
			}
			money-=coinUnit[i]*coinNum;
			
			coin[i]-=coinNum;
			
		System.out.println(coinUnit[i]+"원 : "+coinNum);
	}
	System.out.println(money);
	if(money>0)
	{
		System.out.println("거스름돈이 부족합니다.");
		System.exit(0);//프로그램을 종료합니다.
	}
	System.out.println("=남은 동전의 개수 =");
	
	for (int i=0;i<coinUnit.length;i++)
	{
		System.out.println(coinUnit[i]+"원 : "+coin[i]);
	}
	}
}
