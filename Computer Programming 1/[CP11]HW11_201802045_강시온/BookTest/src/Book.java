/******************************
*
* ��ǻ�����α׷��� 1 (11) HW11
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Book {
	private String title;
	private int number;
	private String author;

	public String getTitle() { // title ������
		return title;
	}

	public void setTitle(String title) { // title ������
		this.title = title;
	}

	public int getNumber() { // number ������
		return number;
	}

	public void setNumber(int page) { // number ������
		this.number = page;
	}

	public String getAuthor() { // author ������
		return author;
	}

	public void setAuthor(String author) { // author ������
		this.author = author;
	}

	public Book(int number, String title, String author) { // Book ������
		this.title = title;
		this.number = number;
		this.author = author;
	}

	public boolean equals(Object obj) {	//equals ������
		Book other = (Book) obj;
		if (number == other.number)		//������ȣ�� �����ϸ� ������ å���� ����
			return true;
		else							//������ȣ�� �ٸ��� �ٸ� å���� ����
			return false;
	}

	public int getLateFees(int days) {	//��ü��
		return 0;
	}
}

class Novel extends Book {				//Book Ŭ������ ��ӹ��� Novel Ŭ����
	public int getLateFees(int days) {	//��ü�� Novel: 300��/��
		return days * 300;
	}
	
	public Novel(int number, String title, String author) {	//Novle ������
		super(number, title, author);
	}
}

class Poet extends Book {				//Book Ŭ������ ��ӹ��� Poet Ŭ����
	public int getLateFees(int days) {	//��ü�� Poet: 200��/��
		return days * 200;
	}

	public Poet(int number, String title, String author) {	//Poet ������
		super(number, title, author);
	}
}

class ScienceFiction extends Book {		//Book Ŭ������ ��ӹ��� ScienceFiction Ŭ����
	public int getLateFees(int days) {	//��ü�� ScienceFiction: 600��/��
		return days * 600;
	}

	public ScienceFiction(int number, String title, String author) {	//ScienceFiction ������
		super(number, title, author);
	}
}
