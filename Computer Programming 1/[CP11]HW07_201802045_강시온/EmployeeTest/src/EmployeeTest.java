/******************************
*
* ��ǻ�����α׷��� 1 (11) HW07
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setName("ȫ�浿");			//�̸� ����
		employee.setNum("010-1111-1111");	//��ȭ��ȣ ����
		employee.setNalary(3000);			//���� ����
		
		System.out.println("���� �̸� : " + employee.getName());	//�̸� ���
		System.out.println("��ȭ ��ȣ : " + employee.getNum());		//��ȭ��ȣ ���
		System.out.println("���� : " + employee.getNalary());		//���� ���
	}
}