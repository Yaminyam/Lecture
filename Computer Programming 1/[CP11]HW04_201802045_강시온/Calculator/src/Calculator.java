/******************************
*
* ��ǻ�����α׷��� 1 (11) HW01
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char operator;
		int num1;
		int num2;
		
		System.out.print("���ڸ� �ϳ� �Է��Ͻÿ�. : ");
		operator = input.next().charAt(0);		//�����ڸ� �Է¹޴´�
		System.out.print("���� �� ���� �Է��Ͻÿ�. : ");
		num1 = input.nextInt();					//ù��° ���ڸ� �Է¹޴´�
		num2 = input.nextInt();					//�ι�° ���ڸ� �Է¹޴´�
		
		if(operator == '+')						//����
		{
			System.out.printf("%d + %d = %d �Դϴ�.",num1,num2,num1+num2);
		}
		else if(operator == '-')				//����
		{
			System.out.printf("%d - %d = %d �Դϴ�.",num1,num2,num1-num2);
		}
		else if(operator == '*')				//����
		{
			System.out.printf("%d * %d = %d �Դϴ�.",num1,num2,num1*num2);
		}
		else if(operator == '/')				//������
		{
			if(num2 == 0)						//0���� �������� ����ó��
			{
				System.out.printf("�и� 0�̸� ���� �� �����ϴ�.");
			}
			System.out.printf("%d / %d = %d �Դϴ�.",num1,num2,num1/num2);
		}
		else									//�Է¹޴� ���ڰ� �����ڰ� �ƴҰ��
		{
			System.out.print("�Է��� ���ڰ� �����ڰ� �ƴմϴ�.");
		}
	}

}
