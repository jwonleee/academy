package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz19_2 {

	public static void main(String[] args) {
		
		/*
		 * 1. 사람수(정수)를 입력 받습니다.
		 * 2. 입력받은 사람수 만큼 랜덤한 배열을 생성해서 중복되지 않게 랜덤값을 저장
		 * 
		 * 랜덤값 크기 1 <= x <= 사람수
		 * 
		 * 힌트> 집어넣기 전에 집어넣기 직전까지 중복값이 있는지 확인
		 * 
		 * 3. 중복되지 않는 배열이 생성 되었다면, ○문자를 이용해서 배열의 크기를 출력
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 선택된 좌석이면 자리번호를 공개하고 출력
		 * 	  제대로 선택되지 않은 좌석이면 다시 선택을 출력
		 * 
		 * 힌트> 선택된 자리는 0으로 변경 혹은 문자열 배열 만들기
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배정할 좌석의 크기를 지정하세요> ");
		int size = scan.nextInt();
		
		int []arr = new int[size];
		
		int index = 0; // 현재 위치변수
		re: while(true) {
			
			int seat = (int)(Math.random()*size) + 1; // 1~size 랜덤수
			
			for(int i = 0; i < index; i++) {
				if(arr[i] == seat) continue re;
			}
			
			arr[index] = seat;
			index++;
			
			if(index == size) break;
			
		}
		
		
		// 좌석 출력
		int count = 0;
		while(true) {
			
			System.out.println(Arrays.toString(arr));
			
			System.out.println("-----------좌석 선택 프로그램------------");
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%-3d",i+1); // %-3d=3자리 공간을 잡고 왼쪽부터 채움
			}
								
			System.out.println();
					
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i] == 0) {
					System.out.printf("%-3s","● ");
				} else {
					System.out.printf("%-3s","○ ");
				}
			}
			
			System.out.println();
			
			System.out.print("좌석 선택> ");
			int seat = scan.nextInt();
			
			// 입력을 받은 직후
			if(arr[seat-1] == 0) {
				System.out.println("제대로 선택하실래요?");
			} else {
				System.out.println("선택좌석: " + arr[seat-1]);
				arr[seat-1] = 0; // 절대 선택이 될 수 없는 값으로 만듦
				count++; // 좌석 선택시 카운트증가
			}
			
			if(count == size) {
				System.out.println("종료합니다");
				break; // 탈출
			}
		}

		
	}
}
