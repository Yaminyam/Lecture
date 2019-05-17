/******************************
*
* ��ǻ�����α׷��� 1 (11) HW05
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class Fibonacci {
	public static void main(String[] args) {
		int n = 30;
		long startTime,endTime;
		startTime = System.currentTimeMillis();
		System.out.println(loopFibonacci(n));
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000.0);
		startTime = System.currentTimeMillis();
		System.out.println(recursiveFibonacci(n));
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000.0);
	}
	public static long loopFibonacci(int n) {
		long f0 = 0;									//�Ǻ���ġ������ ù��° ��
		long f1 = 1;									//�Ǻ���ġ������ �ι�° ��
		long f2 = 1;
		
		for(int i=0;i<n-1;i++) {
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		}
		return f2;
	}
	public static long recursiveFibonacci(int n) {
		if(n == 0)
			return 0;
		else if(n==1)
			return 1;
		else
			return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
}
