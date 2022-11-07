package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {

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
		int num = scan.nextInt();
		
		int []arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*num)+1;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
				}
			}
		}
		
		
		System.out.println("-----------좌석 선택 프로그램------------");
		for(int i = 0; i < num; i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println();
		for(int i = 0; i < num; i++) {
			System.out.print("○ ");
		}
		System.out.println();
		
		
		for(int j = 0; j < arr.length; j++) {
			
			System.out.print("좌석 선택> ");
			int seat = scan.nextInt();
	
				System.out.println("-----------좌석 선택 프로그램------------");
				for(int i = 0; i < num; i++) {
					System.out.print((i+1) + " ");
				}
				
				System.out.println();
				
				for(int i = 0; i < num; i++) {
					if(arr[i] == seat) {
						System.out.print("●" + " ");
						
					} else {
						System.out.print("○" + " ");
					}
				}
				
				System.out.println();
				
//			if(arr[j] != seat) {
//				System.out.print("자리 번호를 공개합니다: ");
//			}
			System.out.println();
		}
		
			System.out.println(Arrays.toString(arr));
//			4번까지만 출력함.. 엉망진창
			
		
	}
}
