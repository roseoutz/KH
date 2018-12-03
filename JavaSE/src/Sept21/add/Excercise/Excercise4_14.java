package Sept21.add.Excercise;

public class Excercise4_14 {
	public static void main(String[] args)
	{
		int num = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do 
		{
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if(num==input)
			{
				System.out.println("정답입니"+"count ="+count);
				break;
			}
			else if(num<input) 
			{
				System.out.println("input bigger");
			}
			else
			{
				System.out.println("input lower");
			}
		} while(true);
		}
	}

