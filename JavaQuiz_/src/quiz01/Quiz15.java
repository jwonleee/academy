package quiz01;

public class Quiz15 {

	public static void main(String[] args) {
		
//		힌트 -> 출력은 가로 or 세로로만 가능합니다.
//		정렬은 \t -> 8칸 띄어쓰기, 줄 맞춰줌
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.printf("%d x %d = %d\t",j,i,i*j);
				}
			System.out.println();
		}
			
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 4; j <= 6; j++) {
				System.out.printf("%d x %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
	
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 7; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 1; i <= 9; i+=3) { // 세로로 1, 4, 7
			
			for(int j = 1; j <= 9; j++) { // 가로로 ~>
				
				
				System.out.print(i   + "x" + j + "=" +   i*j   + "\t"); // 1x1=1
				System.out.print(i+1 + "x" + j + "=" + (i+1)*j + "\t"); // 2x1=2
				System.out.print(i+2 + "x" + j + "=" + (i+2)*j + "\t"); // 3x1=3
				
				System.out.println(); // 줄바꿈
			}
			
			System.out.println(); // 줄바꿈
			
		}
	}
}
