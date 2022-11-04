package quiz10;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 20, 123123 )을 저장 하고 값을 확인하세요.
		 */
		
		User u1 = new User("홍길동", 20, 123123);
		System.out.println(u1.getName() + " - " + u1.getAge() + " - " + u1.getRrn());
		
//		내가 한 풀이
//		u.setName("홍길동");
//		String name = u.getName();
//		u.setAge(20);
//		int age = u.getAge();
//		u.setRrn(123123);
//		int rrn = u.getRrn();
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
//		System.out.println("주민등록번호: " + rrn);

		
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 30, rrn값)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
			 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
			 * ex) User[] arr = new User[2];
		 */
//		클래스도 타입이다	
//		String[] arr = new String[2];
//		User[] arr = new User[2]; 유저라는 객체를 배열에 똑같이 저장 가능, 변수명으로, 객체생성해서 변수명에 넣으면 됨

		User u2 = new User("김길동", 30, 456456);
		User[] arr = new User[2]; // 유저 객체를 담을 배열
		
		arr[0] = u1; // 0번째에 u1이 통째로 들어간다(주소 나옴)
		arr[1] = u2;
		
		System.out.println(Arrays.toString(arr)); // [quiz10.User@626b2d4a, quiz10.User@5e91993f]
		System.out.println(arr[0] == u1); // true
		System.out.println(arr[1] == u2); // true
		
//		for(int i = 0; i < arr.length; i++) {
//			User u = arr[i];
//			System.out.println(u.getName());
//			System.out.println(u.getRrn());
//			System.out.println(u.getAge());
//		}
		
		for(User u : arr) { // User 타입
			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println(u.getAge());
		}
		
		
		
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 * 주소값만 확인하면 됨
		 */ 
		
		Scanner scan = new Scanner(System.in); // 한번만 선언
		User[] arr2 = new User[5]; // 한번만 선언
		
		int i = 0;
		while(i < 5) {
			String name = scan.next();
			int rrn = scan.nextInt();
			int age = scan.nextInt();
			
			User u3 = new User(name, rrn, age); // 생성자
		
			arr2[i] = u3; // 저장을 안하면 첫번째 객체는 없어져버림
			i++;
			
			System.out.println(Arrays.toString(arr2));
		}
		
//	잘못한 풀이		User u = arr2[j];
//				System.out.println(u3.getName());
//				System.out.println(u3.getRrn());
//				System.out.println(u3.getAge());
		
//	선생님 풀이 - setter사용
//		int i = 0;
//		while(i < arr2.length) {
//			//입력
//			String name = scan.next();
//			int rrn = scan.nextInt();
//			int age = scan.nextInt();
//			
//			User u3 = new User();
//			u3.setName(name);
//			u3.setRrn(rrn);
//			u3.setAge(age);
//			
//			arr2[i] = u3;
//		}
		
	}
}
