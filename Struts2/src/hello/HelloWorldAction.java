package hello;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action{
	private String msg;
	private String name;
	
	public String getMsg() {
		return msg;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception {
		msg = "hello, " + name;
		return SUCCESS;
	}
}
