/******************************
*
* ��ǻ�����α׷��� 1 (11) HW06
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class ComplexNumTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//��ĳ�� ��ü ����
		ComplexNum com1 = new ComplexNum();			//ù��° ���Ҽ� ��ü ����
		ComplexNum com2 = new ComplexNum();			//�ι�° ���Ҽ� ��ü ����
		
		
		System.out.print("���Ҽ�1�� �Ǽ����� ������� �Է��Ͻÿ� : ");
		com1.real = input.nextInt();				//ù��° ���Ҽ��� �Ǽ��κ��� �Է�
		com1.imag = input.nextInt();				//ù��° ���Ҽ��� ����κ��� �Է�
		
		System.out.print("���Ҽ�2�� �Ǽ����� ������� �Է��Ͻÿ� : ");
		com2.real = input.nextInt();				//�ι�° ���Ҽ��� �Ǽ��κ��� �Է�
		com2.imag = input.nextInt();				//�ι�° ���Ҽ��� ����κ��� �Է�
		
		System.out.printf("���Ҽ�1 : %.1f + %.1fi\n", com1.real, com1.imag);		//ù��° ���Ҽ� ���
		System.out.printf("���Ҽ�2 : %.1f + %.1fi\n", com2.real, com2.imag);		//�ι�° ���Ҽ� ���
		
		com1.add(com2.real, com2.imag);				//���Ҽ� 2���� ����
		com1.sub(com2.real, com2.imag);				//���Ҽ� 2���� ����
		com1.mul(com2.real, com2.imag);				//���Ҽ� 2���� ����
		com1.div(com2.real, com2.imag);				//���Ҽ� 2���� ������
	}
}
