package Sept22.add;

public class FlowEx6 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 10) + 1;
		//Math.random 의 경유 0~9 까지의 double 형 난수 생성
		
		switch(score*100)
		{
		case 100 : 
			System.out.println("100");
			break;
		case 200 :
			System.out.println("200");
			break;
		case 300 :
			System.out.println("300");
			break;
		case 400 : 
			System.out.println("400");
			break;
		default :
			System.out.println("?"
					);
				
			
		}
	}

}
