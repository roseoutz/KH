package Oct4.etc;

public class AutoboxingEx2 {
	
	Integer var;
	public void setInt(int i) {
		var = i;
	}
	
	public Integer getInt()
	{
		return var;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoboxingEx1 a1 = new AutoboxingEx1();
		a1.setInt(10000);
		int res = a1.getInt();
		System.out.println(res);
	}

}
