package Octp1.Static;

class StaticTest3
{
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println(sc1.c+" + "+StaticCount.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println(sc2.c+" + "+StaticCount.count);
		
		StaticCount sc3 = new StaticCount();
		System.out.println(sc3.c+" + "+StaticCount.count);
		
	}
}