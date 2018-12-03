package Oct16.Thread.add;

public class ThreadEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	for(int i=0;i<300;i++) {
		System.out.print("-");
	}
	System.out.println();
	System.out.print("시간소요1 : " +(System.currentTimeMillis()-startTime));
	
	for(int i=0;i<300;i++) {
		System.out.print("|");
	}
	
	System.out.println("소요시간2 : " + (System.currentTimeMillis()-startTime));
	}

}
