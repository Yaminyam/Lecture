#include<stdio.h>

float GetMid(float num1, float num2, float num3);
float GetMin(float num1, float num2, float num3);
float GetMax(float num1, float num2, float num3);

int main()
{
	float f1, f2, f3;
	scanf("%f %f %f", &f1, &f2, &f3);
	printf("%f %f %f�� ������ ���� %f %f %f�Դϴ�.\n", f1, f2, f3, GetMin(f1, f2, f3), GetMid(f1, f2, f3), GetMax(f1, f2, f3));
}

float GetMid(float num1, float num2, float num3) {		//�߾Ӱ� Ž��
	if (num1 > num2 && num2 > num3)return num2;
	else if (num2 > num3 && num3 > num1)return num3;
	else if (num3 > num1 && num1 > num2)return num1;
}

float GetMin(float num1, float num2, float num3) {		//�ּҰ� Ž��
	if (num1 > num2 && num3 > num2)return num2;
	else if (num2 > num3 && num1 > num3)return num3;
	else if (num3 > num1 && num2 > num1)return num1;
}

float GetMax(float num1, float num2, float num3) {		//�ִ밪 Ž��
	if (num2 > num1 && num2 > num3)return num2;
	else if (num3 > num2 && num3 > num1)return num3;
	else if (num1 > num3 && num1 > num2)return num1;
}