#include<stdio.h>

int main() {
	double input;								//�Է¹��� �Ǽ� ��
	scanf("%lf", &input);						//�Ǽ� �Է�
	printf("����: %10e\n", input*input);			//���� ���
	printf("������: %10e\n", input*input*input);	//������ ���
}