/******************************
*
* ��ǻ�����α׷��� 1 (11) HW06
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class CharCountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word;
		int vowelcount = 0;					//������ ����
		int consonantcount = 0;				//������ ����
		
		System.out.print("���ڿ� : ");
		word = input.nextLine();			//���ڿ��� �Է¹޴´�
		word = word.toLowerCase();			//������ ���� ������ �Ǻ��� ���ϰ� �ϱ����� ��� �ҹ��ڷ� ��ȯ
		
		for(int i = 0; i < word.length(); i++)	//������ ���̸�ŭ �ѱ��ھ� �Ǻ��Ѵ�
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o')
			{
				vowelcount++;				//������ ���
			}
			else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
			{
				consonantcount++;			//������ �ƴ� ���ĺ��� ���
			}
		}
		System.out.printf("���� : %d��\n", consonantcount);		//������ ���� ���
		System.out.printf("���� : %d��", vowelcount);				//������ ���� ���
	}
}
