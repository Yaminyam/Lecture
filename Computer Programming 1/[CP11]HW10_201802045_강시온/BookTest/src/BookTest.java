/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("b0", 100, "author0");		//Book Ŭ������ b1 ��ü ����
		Magazine m1 = new Magazine("m1", 200, "author1", "2018.05.22");	//Magazine Ŭ������ m1 ��ü ����
		Magazine m2 = new Magazine("m2", 333, "author2", "2018.05.29");	//Magazine Ŭ������ m2 ��ü ����
		
		System.out.println("title : " + b1.getTitle());		//b1 ��ü ���
		System.out.println("page : " + b1.getPage());
		System.out.println("author : " + b1.getAuthor());
		System.out.println();
		
		System.out.println("title : " + m1.getTitle());		//m1 ��ü ���
		System.out.println("page : " + m1.getPage());
		System.out.println("author : " + m1.getAuthor());
		System.out.println("date : " + m1.getDate());
		System.out.println();
		
		System.out.println("title : " + m2.getTitle());		//m2 ��ü ���
		System.out.println("page : " + m2.getPage());
		System.out.println("author : " + m2.getAuthor());
		System.out.println("date : " + m2.getDate());
	}
}
