#include<stdio.h>
#include<stdlib.h>

int check(int arr[], int index, int number) {
	if (index > 20) return -1;				//���� �̹߰�
	if (arr[index] == number)return index;	//���� �߰�
	return check(arr, index + 1, number);	//���� �ε��� Ž��
}

int main()
{
	int arr[20];
	int number;
	for (int i = 0; i < 20; i++) {			//���� ����
		arr[i] = rand() % 40 + 10;
	}
	scanf("%d", &number);
	int index = check(arr, 0, number);		//���
	if (index == -1) {						//���� �̹߰� ���
		printf("�˻���� ����");
	}
	else {									//���� �߰� ���
		printf("%d", index);
	}
}