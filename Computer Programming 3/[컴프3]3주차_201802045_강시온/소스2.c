#include <stdio.h>
#include <ctype.h>

int main() {
	char input[6];                           //�Է¹��� ������
	int check = 1;                            //1�϶� �����̸����� ����, 0�϶� �Ұ���

	input[0] = getchar();                        //�������� �Է�
	input[1] = getchar();
	input[2] = getchar();
	input[3] = getchar();
	input[4] = getchar();
	input[5] = '\0';

	if (!(isalpha(input[0]) || input[0] == '_'))              //ù���ڷδ� ����ٿ� ��� ��밡��
		check = 0;
	if (!(isalpha(input[1]) || isdigit(input[1]) || input[1] == '_'))  //�ι�°���ʹ� ����� ���� ���� ��밡��
		check = 0;
	if (!(isalpha(input[2]) || isdigit(input[2]) || input[2] == '_'))
		check = 0;
	if (!(isalpha(input[3]) || isdigit(input[3]) || input[3] == '_'))
		check = 0;
	if (!(isalpha(input[4]) || isdigit(input[4]) || input[4] == '_'))
		check = 0;

	printf("%s %s", input, check ? "True" : "False");            //���������� ��� �� �� �ִ��� ���
}