package checkbox.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import checkbox.model.User;

public class checkboxAction implements Action, Preparable, ModelDriven {

	User user;
	Log log = LogFactory.getLog(checkboxAction.class);
	
	public String execute() throws Exception {
		log.info(">>>>MALE : " + user.getMale());
		log.info(">>>>MALE : " + user.getFemale());
		return SUCCESS;
	}
	
	public void prepare() {
		user = new User();
	}
	
	public Object getModel() {
		return user;
	}
}
