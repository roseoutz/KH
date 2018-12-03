package interceptor.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import interceptor.dao.SumDAO;
import interceptor.model.NumberForAdd;

public class SumAction implements Action, Preparable, ModelDriven {

	NumberForAdd num;
	private int sum = 0;
	
	public String execute() throws Exception {
		SumDAO dao = new SumDAO();
		sum = dao.add(num);
		return SUCCESS;
	}
	
	public void prepare() throws Exception {
		num = new NumberForAdd();
	}
	
	public Object getModel() {
		return num;
	}
	
	public int getSum() {
		return sum;
	}
}
