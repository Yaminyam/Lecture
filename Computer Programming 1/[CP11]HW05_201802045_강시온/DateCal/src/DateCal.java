/******************************
*
* ��ǻ�����α׷��� 1 (11) HW05
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class DateCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);				//��ĳ�� ��ä ����
		int year;
		int month;
		int day;
		int term;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		year = s.nextInt();								//������ �Է¹޴´�
		System.out.print("���� �Է��Ͻÿ�: ");
		month = s.nextInt();							//���� �Է¹޴´�
		System.out.print("���� �Է��Ͻÿ�: ");
		day = s.nextInt();								//���� �Է¹޴´�
		
		term = (year - 1900) * 365 + (year - 1900) /4;	//�� �� ������ �� ���� �Ⱓ�� ���Ѵ�
		if(year % 4 == 0 || (year % 100 != 0 && year % 400 == 0))
		{
			term += (year - 1900) / 4;					//�����϶��� �Ϸ縦 ���Ѵ�
			if(month == 2 || month == 1)				//2���̳� 1���϶��� ���� 2�� 29���� ������ �ʾ����Ƿ� �����Ѵ�
			{
				term--;
			}
		}
		
		if(month == 2)									//�� �ޱ����� �� ���� ���Ѵ�
		{
			term += 31;
		}
		else if(month == 3)
		{
			term += 59;
		}
		else if(month == 4)
		{
			term += 90;
		}
		else if(month == 5)
		{
			term += 120;
		}
		else if(month == 6)
		{
			term += 151;
		}
		else if(month == 7)
		{
			term += 181;
		}
		else if(month == 8)
		{
			term += 212;
		}
		else if(month == 9)
		{
			term += 243;
		}
		else if(month == 10)
		{
			term += 273;
		}
		else if(month == 11)
		{
			term += 304;
		}
		else if(month == 12)
		{
			term += 334;
		}
		
		term += day;									//���� ���Ѵ�
		
		switch(term%7) {								//�Ⱓ�� 7�� ���������� �������� �����̴�
		case 1:
			System.out.printf("%d�� %d�� %d���� �������Դϴ�.", year, month, day);
			break;
		case 2:
			System.out.printf("%d�� %d�� %d���� ȭ�����Դϴ�.", year, month, day);
			break;
		case 3:
			System.out.printf("%d�� %d�� %d���� �������Դϴ�.", year, month, day);
			break;
		case 4:
			System.out.printf("%d�� %d�� %d���� ������Դϴ�.", year, month, day);
			break;
		case 5:
			System.out.printf("%d�� %d�� %d���� �ݿ����Դϴ�.", year, month, day);
			break;
		case 6:
			System.out.printf("%d�� %d�� %d���� ������Դϴ�.", year, month, day);
			break;
		default:
			System.out.printf("%d�� %d�� %d���� �Ͽ����Դϴ�.", year, month, day);
		}
			
	}

}
