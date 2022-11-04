package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
//		Math m = new Math(); 객체 생성 X

//		올림
		double up = Math.ceil(1.3);
		System.out.println(up);
		
//		내림
		double down = Math.floor(1.2);
		System.out.println(down);
	
//		반올림
		double r = Math.round(3.14);
		System.out.println(r);
		
//		루트값
		double sqrt = Math.sqrt(16);
		System.out.println(sqrt);
		
//		절대값
		double abs = Math.abs(-4);
		System.out.println(abs);
		
//		큰 값
		int max = Math.max(5, 3);
		System.out.println(max);
	}
}
