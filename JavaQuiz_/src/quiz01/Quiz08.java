package quiz01;

public class Quiz08 {

	public static void main(String[] args) {
		
		//1. 1~100까지 정수 중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		
			int a = 1;
			while(a <= 100) {
				
				if((a % 3 == 0) || (a % 4 == 0)) {
					System.out.print(a + " ");
				}
				
				a++;
			}
		
			
			System.out.println();
		//2. 1~200까지 정수 중에 6의 배수의 합계
	
			int sum = 0; // 누적시킬 변수
			
			int b = 1;
			while(b <= 200) {
				
				if(b % 6 == 0) {
					sum += b; // sum에다가 b 누적한다고 외우기
				}
				
				b++;
			}
		
			System.out.println(sum);
		
			
		//3. 1~100까지 정수 중에 4의 배수이면서, 8의 배수가 아닌수의 개수
			
			int count = 0; //카운트 변수
		
			int c = 1;
			while(c <= 100) {
				
				if((c % 4 == 0) && (c % 8 != 0)) {
					count++; // count += 1; 같음
				}
				
				c++;
			}
		
			System.out.println(count);
		
		
		//4. 1000의 약수의 개수 (약수는 나누어 떨어지는 수)
			
			int count2 = 0;
			
			int d = 1;
			while(d <= 1000) {
				
				if(1000 % d == 0 ) {
					count2++;
				}
				
				d++;
			}
			
			System.out.println(count2);
		
	}
}
