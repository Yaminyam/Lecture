/******************************
*
* ��ǻ�����α׷��� 1 (11) HW10
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class Hexa2bin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] hexa2bin = {"0000", "0001", "0010", "0011",	//16������ 2������ ��ȯ�� ǥ
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"};
		
		String hexa;								//16������ ���� ����
		
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ� : ");
		hexa = input.nextLine();
		
		String[] bin = new String[hexa.length()];	//��ȯ�� 2������ ���� ����
		
		for(int i = 0; i < hexa.length(); i++) {
			if(hexa.charAt(i) - 48 >= 1 && hexa.charAt(i) - 48 <= 9) {	//�Էµ� 16������ 1~9�����϶�
				bin[i] = hexa2bin[hexa.charAt(i) - 48];		//�ƽ�Ű�ڵ带 ������ ��ȯ�ϱ� ���ؼ� 48�� ����
			}
			else if(hexa.charAt(i) - 87 >= 10 && hexa.charAt(i) - 87 <= 15) {	//�Էµ� 16������ a~f�϶�
				bin[i] = hexa2bin[hexa.charAt(i) - 87];		//�ƽ�Ű�ڵ带 ������ ��ȯ�ϱ� ���ؼ� 87�� ����
			}
		}
		System.out.print("\"" + hexa + "\"�� ���� �������� ");
		for(int i = 0; i < hexa.length(); i++) {			//��� ���
			System.out.print(bin[i] + " ");
		}
		System.out.print("�Դϴ�.");
	}
}
