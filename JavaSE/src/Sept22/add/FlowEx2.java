package Sept22.add;

public class FlowEx2 {
	public static void main(String[] args)
	{
		int visitCount = 5;
		if(visitCount < 1)
		{
			System.out.println("?");
		}
		else
		{
			System.out.println("/");
		}
	System.out.println("?"+ ++visitCount + "/");
	}
}
