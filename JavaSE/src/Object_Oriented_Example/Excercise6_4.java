package Object_Oriented_Example;

public class Excercise6_4 {
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("name " + s.name);
		System.out.println("Total " +s.getTotal());
		System.out.println("Avg " + s.getAverage());
	}
}
