/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Magazine extends Book {
	private String date;

	public String getDate() {		//date ������
		return date;
	}

	public void setDate(String date) {		//date ������
		this.date = date;
	}
	
	public Magazine(String title, int page, String author, String date) {	//Magazine ������
		super(title, page, author);
		this.date = date;
	}
}
