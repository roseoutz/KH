package Oct10.add;

public class FinallyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startIsntall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			deleteTempFiles();
		}
	}
	
	static void startIsntall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}

}
