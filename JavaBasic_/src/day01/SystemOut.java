package day01;

public class SystemOut {
	
	public static void main(String[] args) {
	
		/*
		 * 단축키
		 * ctrl + x = 잘라내기
		 * end, home으로 커서를 마지막, 처음으로 이동
		 * shift + end, home
		 * 
		 * 정렬키
		 * ctrl + a 전체선택, ctrl + i 줄맞춤
		 * 행삭제
		 * ctrl + d
		 * 행복사
		 * ctrl + alt + 방향키
		 * 코드이동
		 * alt + 방향키
		 * 빠른 주석
		 * ctrl + /
		 * 
		 */		
		
		
		//문자와 숫자
		//ctrl + f11 실행 단축키
		System.out.print("1");
		System.out.print("\n");
		System.out.print(1);
		System.out.print("\n");
		
		//sysout이라고 적고 ctrl + space 출력문을 자동생성
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		//형식을 지정하는 출력문 printf
		//문자형식을 미리지정하고, 필요한 출력값을 지정하는 형태
		/*
		 * 서식문자
		 * %s - 문자열을 입력받음
		 * %d - 정수를 입력받음
		 * %f - 실수를 입력받음 (%.2f - 소수부 자리수를 의미함)
		 * \n - 줄바꿈
		 * \t - 8칸 간격 들여쓰기 출력
		 */
		System.out.printf("안녕하세요. 제 이름은 %s 입니다.\n", "홍길동" );
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 9, 20);
		System.out.printf("파이의 값은 %.2f입니다.\n", 3.14);
		System.out.printf("%d x %d = %d\t%d x %d = %d", 2, 1, 2, 2, 2, 4);
		
		
	}
}
