/******************************
*
* ��ǻ�����α׷��� 1 (11) HW02
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int radius; //������
		int height; //����
		double volume; //����
		double PI = 3.141592; //��� ������ �ٻ簪
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		radius = input.nextInt(); //�������� �Է¹޴´�
		
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		height = input.nextInt(); //���̸� �Է¹޴´�
		
		volume = PI*radius*radius*height; //����*����������*����=����
		
		System.out.print("������� ���Ǵ� " + volume + "�Դϴ�."); //���
	
	}

}
