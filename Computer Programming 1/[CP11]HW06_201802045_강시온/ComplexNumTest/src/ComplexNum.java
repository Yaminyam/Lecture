/******************************
*
* ��ǻ�����α׷��� 1 (11) HW06
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class ComplexNum {
	
	public double real;										//���Ҽ��� �����κ� �ʵ�
	public double imag;										//���Ҽ��� ����κ� �ʵ�
	
	public void add(double real2, double imag2)				//���Ҽ��� ���� �޼ҵ�
	{
		System.out.printf("���Ҽ�1 + ���Ҽ�2 = %.1f + %.1fi\n", real+real2, imag+imag2);
	}
	
	public void sub(double real2, double imag2)				//���Ҽ��� ���� �޼ҵ�
	{
		System.out.printf("���Ҽ�1 - ���Ҽ�2 = %.1f + %.1fi\n", real-real2, imag-imag2);
	}
	
	public void mul(double real2, double imag2)				//���Ҽ��� ���� �޼ҵ�
	{
		System.out.printf("���Ҽ�1 x ���Ҽ�2 = %.1f + %.1fi\n", real*real2-imag*imag2, real*imag2+real2*imag);
	}
	
	public void div(double real2, double imag2)				//���Ҽ��� ������ �޼ҵ�
	{
		if(real2 + imag2 == 0)								//�и� 0�ϰ���� ����
		{
			System.out.print("���Ҽ�2�� 0�̹Ƿ� �������� ������ �� �����ϴ�.");
		}
		else												//�и� 0�� �ƴ� ���
		{
			System.out.printf("���Ҽ�1 / ���Ҽ�2 = %.1f + %.1fi", (real*real2+imag*imag2)/(real2*real2+imag2*imag2),(imag*real2-real*imag2)/(real2*real2+imag2*imag2));
		}
	}
}
