/******************************
*
* ��ǻ�����α׷��� 1 (11) HW07
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Employee {
	private String name;				//�̸� �ʵ�
	private String num;					//��ȭ��ȣ �ʵ�
	private int nalary;					//���� �ʵ�
	
	public String getName() {			//�̸� ������
		return name;
	}
	public void setName(String iname) {	//�̸� ������
		name = iname;
	}
	public String getNum() {			//��ȭ��ȣ ������
		return num;
	}
	public void setNum(String inum) {	//��ȭ��ȣ ������
		num = inum;
	}
	public int getNalary() {			//���� ������
		return nalary;
	}
	public void setNalary(int inalary) {//���� ������
		nalary = inalary;
	}
	
}