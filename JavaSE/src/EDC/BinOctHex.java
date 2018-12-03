package EDC;

public class BinOctHex {
	public static void main(String[] args)
	{
		int dem = 127;
		String oct;
		String hex;
		
		hex = Integer.toHexString(dem);
		oct = Integer.toOctalString(dem);
		
		System.out.println(hex);
		System.out.println(oct);
	}
}
