package Object_Oriented_Example;

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public double getDistance(int x1, int y1) {
		return Math.sqrt(0.5)*((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
}

public class Excercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
	}

}
