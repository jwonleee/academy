package day02;

public class BreakEx03 {

	public static void main(String[] args) {
		
//		중첩반복문 사용
		
//		boolean flag = false;
//		for(char c = 'A'; c <= 'Z'; c++) {
//			
//			for(char l = 'a'; l <= 'z'; l++) {
//				
//				System.out.println(c + "-" + l);
//				
//				if(l == 'f') {
//					flag = true;
//					break;
//				}
//				
//			} //inner
//			if(flag) break; // flag가 true라면 탈출
//		}
		
		
		// label:
		ex:for(char c = 'A'; c <= 'Z'; c++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-" + l);
				
				if(l == 'f') break ex;		
				
			} // inner
		}
		
		
	}
}
