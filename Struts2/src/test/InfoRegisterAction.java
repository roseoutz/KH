package test;



import com.opensymphony.xwork2.ActionSupport;

public class InfoRegisterAction extends ActionSupport {

	private InfoVO bean;
	
	protected String getToday() {
		return new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
	}
	
	public InfoVO getBean() {
		return bean;
	}
	
	public void setBean(InfoVO bean) {
		this.bean = bean;
	}
	public void printt(InfoVO bean) {
		System.out.println(bean.getName());
		System.out.println(bean.getPhone());
		System.out.println(bean.getBirth());
		System.out.println(bean.getSex());
		System.out.println(bean.getWdate());
		System.out.println(bean.isPerdata());
	}
	public String execute() throws Exception{
		bean.setWdate(this.getToday());
		printt(bean);
		return SUCCESS;
	}
}
