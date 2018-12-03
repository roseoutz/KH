package calcul;

import java.util.StringTokenizer;

import com.opensymphony.xwork2.Action;

public class calculator implements Action {

	private String string;
	private int result;
	String[] test = new String[3];
	
	public void setString(String string) {
		this.string = string;
	}
	
	public int getResult() {
		return result;
	}
	
	public int sepcal() {
		System.out.println(string);
		int a;
		int b;
		String c;
		int i =0;

		StringTokenizer st = new StringTokenizer(string, ",");
		while(st.hasMoreTokens()) {
			test[i] = (String)st.nextElement();
			System.out.println(test[i]);
			i++;
			
		}
		a = Integer.parseInt(test[0]);
		b = Integer.parseInt(test[2]);
		c = test[1];
		
		if(c.equals("+")) {
			result = a + b;
		} else if(c.equals("-")) {
			result = a - b;
		} else if(c.equals("*")) {
			result = a * b;
		} else if(c.equals("/")) {
			result = a / b;
		}
		return result;
	}
	
	public String execute() {
		result = sepcal();
		System.out.println(result);
		return SUCCESS;
	}
}
