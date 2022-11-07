package quiz05;

import java.util.Scanner;
public class MyAccount extends Account{
 
	/*
	철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.
	
	Account를 상속받고
	withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	금액을 감소시키려고 한다.
	또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	withDraw() 메서드를 오버라이딩 해주세요.
	
	*/
	MyAccount() {
	}
	
	MyAccount(String n, String p, int b) { // 생성자는 상속 불가능!!!
		name = n;
		password = p;
		balance = b;
	}
	
	void withDrew(int a) { // 출금기능
		
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호> ");
		String pw = scan.next();
		
		if( !pw.equals(password) ) {
			System.out.println("비밀번호 오류");
			return; // void에서 사용하면 바로 종료 가능
		} else if(balance < a) {
			System.out.println("잔액부족");
			return; // else구문 사용해도 됨
		}
		
		balance -= a;
		System.out.println("잔액: " + balance);
	}
}
