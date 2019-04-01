/******************************
*
* ��ǻ�����α׷��� 1 (11) HW11
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class BookTest {
	public static Book arrayOfBook[];		//Book ��ü �迭
	public static void main(String[] args) {
		init();
		
		//å���� ������ ���
		System.out.println("book1 : Novel [number=" + arrayOfBook[0].getNumber()
				+ ", title=" + arrayOfBook[0].getTitle()
				+ ", author=" + arrayOfBook[0].getAuthor() + "]");
		System.out.println("book2 : Poet  [number=" + arrayOfBook[1].getNumber()
				+ ", title=" + arrayOfBook[1].getTitle()
				+ ", author=" + arrayOfBook[1].getAuthor() + "]");
		System.out.println("book3 : SF    [number=" + arrayOfBook[2].getNumber()
				+ ", title=" + arrayOfBook[2].getTitle()
				+ ", author=" + arrayOfBook[2].getAuthor() + "]");
		System.out.println("book4 : SF    [number=" + arrayOfBook[3].getNumber()
				+ ", title=" + arrayOfBook[3].getTitle()
				+ ", author=" + arrayOfBook[3].getAuthor() + "]");
		
		//å���� ��ü�ϼ��� ��ü�� ���
		System.out.println("book1(Novel) 4�� ��ü : " + arrayOfBook[0].getLateFees(4));
		System.out.println("book2(Poet)  5�� ��ü : " + arrayOfBook[1].getLateFees(5));
		System.out.println("book3(SF)    3�� ��ü : " + arrayOfBook[2].getLateFees(3));
		
		//������ å���� ���Ͽ� ���
		System.out.println("book4 == book3 ? : " + arrayOfBook[3].equals(arrayOfBook[2]));
		System.out.println("book4 == book1 ? : " + arrayOfBook[3].equals(arrayOfBook[0]));
	}
	
	public static void init() {
		arrayOfBook = new Book[4];
		arrayOfBook[0] = new Novel(1, "Novel1", "author1");			//Book1 ��ü ����
		arrayOfBook[1] = new Poet(2, "Poet1", "author2");			//Book2 ��ü ����
		arrayOfBook[2] = new ScienceFiction(3, "SF1", "author3");	//Book3 ��ü ����
		arrayOfBook[3] = new ScienceFiction(3, "SF1", "author3");	//Book4 ��ü ����
	}
}
