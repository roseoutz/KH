package Object_Oriented_Example;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
}
