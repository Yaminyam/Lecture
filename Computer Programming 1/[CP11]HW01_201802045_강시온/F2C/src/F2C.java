/******************************
*
* ��ǻ�����α׷��� 1 (11) HW01
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class F2C {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		double F; // �Է¹��� ������ ����
		double C; // ��ȯ�ؼ� ������ ������ ����
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ�: ");
		F = input.nextDouble(); // F�� �Է¹޴´�.
		C = 5*(F - 32)/9; // ȭ���� ������ ��ȯ�Ѵ�.
		System.out.print(F+" ȭ���µ��� "+C+" �����µ��Դϴ�."); // ���
	}

}
