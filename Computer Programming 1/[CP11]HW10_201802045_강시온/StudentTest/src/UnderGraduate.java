/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class UnderGraduate extends Student {
	private String club;
	
	//UnderGraduate ������
	public UnderGraduate(String name, int number, String major, double grade, int credit, String club) {
		super(name, number, major, grade, credit);
		this.club = club;
	}
	
	//UnderGraduate�� ������� ��ü�� ����� �ִ� toString
	public String toString() {
		return super.toString() + "\nclub: " + this.club;
	}
}