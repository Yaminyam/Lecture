#include <stdio.h>

int main() {
    
    int money;
    
    scanf("%d",&money);
    int money500 = money/500*500;					//500������ �������� �ݾ�
    money %= 500;									//500������ ���� ������ �ݾ�
    int money100 = money/100*100;					//100������ �������� �ݾ�
    money %= 100;									//100������ ���� ������ �ݾ�
    int money50 = money/50*50;						//50������ �������� �ݾ�
    money %= 50;									//50������ ���� ������ �ݾ�
    int money10 = money/10*10;						//10������ �������� �ݾ�
    money %= 10;									//10������ ���� ������ �ݾ�
    int money1 = money;								//�����ݾ�
													//���
    printf("500������ ���� �� �ݾ� : %d\n",money500);
    printf("100������ ���� �� �ݾ� : %d\n",money100);
    printf("50������ ���� �� �ݾ� : %d\n",money50);
    printf("10������ ���� �� �ݾ� : %d\n",money10);
    printf("1������ ���� �� �ݾ� : %d\n",money1);
}
