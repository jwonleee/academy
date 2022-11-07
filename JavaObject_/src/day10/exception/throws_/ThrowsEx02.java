package day10.exception.throws_;

public class ThrowsEx02 {

//	생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자호출");
		aaa();
		System.out.println("생성자종료"); // aaa()가 끝나고 실행
	}

	public void aaa() throws Exception {
		System.out.println("aaa시작");
		try {
			bbb(1);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("aaa종료"); // bbb()가 끝나고 실행
	}
	
	public void bbb(int i) throws Exception{
		System.out.println("bbb시작");
		
//		try {
//			System.out.println(i / 0); // 예외
//		} catch (Exception e) {	}
		
		System.out.println(i / 0); // 예외
		System.out.println("bbb종료");
	}
	
}
