package Object_Oriented_Example;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		if(isPowerOn==true)
			isPowerOn=false;
		else
			isPowerOn=true;
	}
	void volumeUp() {
		if(volume>=MIN_VOLUME && volume<MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
		if(volume>MIN_VOLUME && volume<=MAX_VOLUME)
			volume--;
	}
	void channelUp() {
		if(channel==MAX_CHANNEL)
			channel=MIN_CHANNEL;
		else
			channel++;
	}
	void channelDown() {
		if(channel==MIN_CHANNEL)
			channel=MAX_CHANNEL;
		else
			channel--;
	}
}

public class Excercise6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println(t.channel+","+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println(t.channel+","+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println(t.channel+","+t.volume);


	}

}
