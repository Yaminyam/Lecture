#include<stdio.h>

int monthday[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };			//���� �ϼ�

int check_data(int year, int month ,int day) {

	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))	//����üũ
		monthday[1]++;												//�����̶�� 2���� 29��
	if ((0 <= year) &&												//�⵵�� ���
		(0 <= month && month <= 12) &&								//1~12������
		(0 <= day && day <= monthday[month - 1])) return 1;			//1~�����ϼ�����
	monthday[1] = 28;
	return 0;
}

int main()
{
	int year, month, day;
	while (1) {
		scanf("%d %d %d", &year, &month, &day);
		if (year == 0 && month == 0 && day == 0) break;
		else if (check_data(year, month, day)) {					//��ȿ�� ��¥
			printf("��ȿ�� ��¥�Դϴ�\n");
			break;
		}
		printf("��ȿ���� ���� ��¥�Դϴ�.\n�ٽ� �Է����ּ���\n");		//������������ ��¥
	}
}