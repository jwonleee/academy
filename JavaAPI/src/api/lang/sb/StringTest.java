package api.lang.sb;

public class StringTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
//		String str = "";
//		for(int i = 1; i < 300000; i++) {
//			str += "A"; // 대략 10초쯤 걸림
//		} 
		StringBuffer sb = new StringBuffer("");
		for(int i = 1; i < 3000000; i++) {
			sb.append("A"); // 실행하자마자 바로 나옴
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) * 0.001);
	}
}
