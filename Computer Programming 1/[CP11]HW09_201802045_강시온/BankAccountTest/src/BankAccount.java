/******************************
*
* ��ǻ�����α׷��� 1 (11) HW09
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

public class BankAccount {
	private String accountNumber;
	private String owner;
	private int balance;
	private double interestRate;
	
	public String getAccountNumber() {			//accountNumber ������
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {		//accountNumber ������
		this.accountNumber = accountNumber;
	}

	public String getOwner() {		//owner ������
		return owner;
	}

	public void setOwner(String owner) {	//owner ������
		this.owner = owner;
	}

	public int getBalance() {		//balance ������
		return balance;
	}

	public void setBalance(int balance) {	//balance ������
		this.balance = balance;
	}

	public double getInterestRate() {	//interestRate ������
		return interestRate;
	}

	public void setInterestRate(double interestRate) {		//interestRate ������
		this.interestRate = interestRate;
	}
	
	public BankAccount() {			//0�� ���� ������
		accountNumber = "12-345-6-7890";
		owner = "ȫ�浿";
		balance = 300000;
		interestRate = 2.20;
	}

	public BankAccount(String o, String a, int b, double i) {		//3�� ���� ������
		accountNumber = a;
		owner = o;
		balance = b;
		interestRate = i;
	}
}
