package day02;

public class IfEx {

	public static void main(String[] args) {
		
//		0 ~ 100까지 랜덤값
		int point = (int)(Math.random() * 101);
		
		System.out.println("점수: " + point);
		
//		점수 60 이상이라면 ~~
		if(point >= 60) { 
			System.out.println("60점 이상입니다.");
			System.out.println("합격입니다.");
		} else {
			System.out.println("60점 미만입니다.");
			System.out.println("불합격입니다.");
		}
	}
}

//		if(point <= 60) {
//			System.out.println("60점 미만입니다.");			
//			System.out.println("불합격입니다.");			
//		} - if 쓰고 if 또 써도 되는데 한번에 쓰려면 위에처럼 쓰면 됨.

