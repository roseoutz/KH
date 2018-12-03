package action;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDBBean;
import board.BoardDataBean;
import board.CommentDBBean;
import board.CommentDataBean;

public class ContentAction implements CommandAction {
	
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		int num = Integer.parseInt(request.getParameter("num"));//해당 글 번호
		String pageNum = request.getParameter("pageNum");
		
		BoardDBBean dbPro = BoardDBBean.getInstance();
		BoardDataBean article = dbPro.getArticle(num);
		
		request.setAttribute("num", new Integer(num));
		request.setAttribute("pageNum", new Integer(pageNum));
		request.setAttribute("article", article);
		
		CommentDBBean cdbPro = CommentDBBean.getInstance();
				
		if(pageNum == null) {
			pageNum="1";
		}
		int pageSize = 10;
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage -1 )* pageSize +1;
		int endRow = currentPage * pageSize;
		int count = 0;
		int number = 0;
		
		List commentList = null;
		count = cdbPro.getcommentCount();
		
		if(count>0) {
			commentList=cdbPro.getcomments(startRow, endRow);
		} else {
			commentList= Collections.EMPTY_LIST;
		}
		
		number = count-(currentPage-1)*pageSize;
		
		request.setAttribute("currentPage", new Integer(currentPage));
		request.setAttribute("startRow", new Integer(startRow));
		request.setAttribute("endRow", new Integer(endRow));
		request.setAttribute("count", new Integer(count));
		request.setAttribute("pageSize", new Integer(pageSize));
		request.setAttribute("number", new Integer(number));
		request.setAttribute("commentList", commentList);
		
		return "/mvc/content.jsp";
	}
}
