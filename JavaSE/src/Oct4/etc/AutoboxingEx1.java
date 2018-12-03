package Oct4.etc;

public class AutoboxingEx1 {
	
	Integer var;
	
	public void setInt(int i)
	{
		var = new Integer(i);
	}
	
	public Integer getInt()
	{
		return var;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AutoboxingEx1 a1 = new AutoboxingEx1();
	a1.setInt(10000);
	Integer temp = a1.getInt();
	int res = temp.intValue();
	System.out.println(res);
	}

}
