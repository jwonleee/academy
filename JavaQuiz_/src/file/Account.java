package file;

public class Account {

	String name;
	String password;
	int balance; // 멤버변수
	
	Account() {
		
	}
	
	Account(String n, String p, int b) {
		name = n;
		password = p;
		balance = b;
	}
	
	void deposit(int a) { // 입금기능
		balance += a; // balance = balance + a;
	}
	
	void withDrew(int a) { // 출금기능
		balance -= a;
	}
	
	int getbalance() { // 잔액 조회
		int result = 0;
		
		result = balance;
		return result; // return balance;
	}
	
}
