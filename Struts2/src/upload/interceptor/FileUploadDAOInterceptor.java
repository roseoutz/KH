package upload.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import upload.dao.FileUploadDAO;

public class FileUploadDAOInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;
	FileUploadDAO fileUploadDAO;	
	public void init() {
		fileUploadDAO = new FileUploadDAO();
	}	
	public void destroy() {
		fileUploadDAO = null;
	}	
	public String intercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();		
		if (action instanceof FileUploadDAOAware) {
			FileUploadDAOAware fileUploadDAOAware = 
(FileUploadDAOAware)action;
			fileUploadDAOAware.setFileUploadDAO(fileUploadDAO);		
		}		
		return invocation.invoke();
	}

}
