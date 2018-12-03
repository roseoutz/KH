package Sept29;


public class TvTest5 {
	public static void main(String[] args)
	{
		TvTest t = new TvTest();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은"+t.channel+"입니다.");
	}
}
