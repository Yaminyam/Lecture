/******************************
*
* ��ǻ�����α׷��� 1 (11) HW03
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class Thaies {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double AC;
		double AE;
		double BC;
		double DE;							
		
		System.out.print("AC : ");
		AC = input.nextDouble();		//AC�� �Է¹޴´�.
		System.out.print("AE : ");
		AE = input.nextDouble();		//AE�� �Է¹޴´�.
		System.out.print("BC : ");		
		BC = input.nextDouble();		//BC�� �Է¹޴´�.
		
		DE=BC*(AE/AC);					//AC : AE = BC : DE ������ ���� ������ ���� ����.
		
		System.out.print("DE : "+DE);	//DE�� ���� ���
	}

}
