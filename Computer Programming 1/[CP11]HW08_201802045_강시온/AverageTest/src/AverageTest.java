/******************************
*
* ��ǻ�����α׷��� 1 (11) HW08
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class AverageTest {
	public static void main(String[] args) {
		Average average = new Average();				//average ��ü����
		
		System.out.println("�� �μ�(10, 20)�� ��� : " + average.getAverage(10, 20));			//�� �μ� average ���
		System.out.println("�� �μ�(10, 20, 30)�� ��� : " + average.getAverage(10, 20, 30)); //�� �μ� average ���
	}
}
