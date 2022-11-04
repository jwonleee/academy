package file;

public class AccountMain {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동", "1234", 35000);
		
		myAcc.deposit(800);
		myAcc.withDrew(1800);
		
		int bal = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은: " + bal + "원입니다.");
		
		
		myAcc.withDrew(1234);
		
		
		
		
	}
}
