package kh.model;

import java.util.List;

public class MessageListView {

	private int messageTotalCount; //입력된 방명록 글의 수.
	private int currentPageNumber; //방명록에서 현재 보여주는 페이지.
	private List<Message> messageList; //테이블에서 꺼내온 방명록 글의 묶음.
	private int pageTotalCount; //페이지의 총 수.
	private int messageCountPerPage; //한 페이지에 보여 줄 방명록 글의 수.
	private int firstRow;
	private int endRow;

	public MessageListView(List<Message> messageList, int messageTotalCount,
			int currentPageNumber, int messageCountPerPage, int startRow,
			int endRow) {
		this.messageList = messageList;
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageCountPerPage = messageCountPerPage;
		this.firstRow = startRow;
		this.endRow = endRow;

		calculatePageTotalCount();
	}

	private void calculatePageTotalCount() {
		if (messageTotalCount == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = messageTotalCount / messageCountPerPage;
			if (messageTotalCount % messageCountPerPage > 0) {
				pageTotalCount++;
			}
		}
	}

	public int getMessageTotalCount() {
		return messageTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public int getMessageCountPerPage() {
		return messageCountPerPage;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public boolean isEmpty() {
		return messageTotalCount == 0;
	}
}



















