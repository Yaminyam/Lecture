/******************************
*
* ��ǻ�����α׷��� 1 (11) HW09
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();											//ù��° ������� ��ü
		BankAccount b2 = new BankAccount("��ö��", "111-22-3-4444", 500000, 1.70);	//�ι�° ������� ��ü
		
		//���
		System.out.println("b1(no parameter) : "+b1.getOwner()+" / "+b1.getAccountNumber()+" / "+b1.getBalance()+" / "+b1.getInterestRate());
		System.out.println("b2(4 parameter) : "+b2.getOwner()+" / "+b2.getAccountNumber()+" / "+b2.getBalance()+" / "+b2.getInterestRate());
	}
}
