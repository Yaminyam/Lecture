/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Student {
	private String name;
	private int number;
	private String major;
	private double grade;
	private int credit;
	
	public String getName() {		//name ������
		return name;
	}
	public void setName(String name) {		//name ������
		this.name = name;
	}
	public int getNumber() {		//number ������
		return number;
	}
	public void setNumber(int number) {		//number ������
		this.number = number;
	}
	public String getMajor() {		//major ������
		return major;
	}
	public void setMajor(String major) {		//major ������
		this.major = major;
	}
	public double getGrade() {		//grade ������
		return grade;
	}
	public void setGrade(double grade) {		//grade ������
		this.grade = grade;
	}
	public int getCredit() {		//credit ������
		return credit;
	}
	public void setCredit(int credit) {		//credit ������
		this.credit = credit;
	}
	
	//Student ������
	public Student(String name, int number, String major, double grade, int credit) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	
	//Student�� ������� ��ü�� ����� �ִ� toString
	public String toString() {
		return "name: " + this.name + "\nnumber: " + this.number + "\nmajor: " + this.major + "\ngrade: " + this.grade + "\ncredit: " + this.credit;
	}
}

