/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Book {
	private String title;
	private int page;
	private String author;
	
	public String getTitle() {		//title ������
		return title;
	}
	public void setTitle(String title) {	//title ������
		this.title = title;
	}
	public int getPage() {		//page ������
		return page;
	}
	public void setPage(int page) {		//page ������
		this.page = page;
	}
	public String getAuthor() {		//author ������
		return author;
	}
	public void setAuthor(String author) {		//author ������
		this.author = author;
	}
	
	public Book(String title, int page, String author) {	//Book ������
		this.title = title;
		this.page = page;
		this.author = author;
	}
}
