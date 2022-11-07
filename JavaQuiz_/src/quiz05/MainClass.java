package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount acc = new MyAccount("홍길동", "1234",5000);
		
		acc.withDrew(1000);
		acc.withDrew(5000);
		acc.withDrew(4000);
	}
}
