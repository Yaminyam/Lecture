/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Graduate extends Student {
	private String typeTa;
	private double scholarshipRate;
	
	//Graduate ������
	public Graduate(String name, int number, String major, double grade, int credit, String typeTa, double scholarshipRate) {
		super(name, number, major, grade, credit);
		this.typeTa = typeTa;
		this.scholarshipRate = scholarshipRate;
	}
	
	//Graduate�� ������� ��ü�� ����� �ִ� toString
	public String toString() {
		return super.toString() + "\ntype of ta: " + this.typeTa + "\nscholarship rate: " + this.scholarshipRate;
	}
}
