package quiz01;
import java.util.Arrays;

public class Quiz23 {

	public static void main(String[] args) {
		
		
		char[] arr = {'A', 'B', 'C'};
		String result = method6(arr); // 결과변수(굳이 return한 str아니어도 됨) = 메서드이름(변수명)
		System.out.println(result);
		// System.out.println(method6(arr)); // 바로 넣어서 출력
		
		int [] arr2 = {1, 2, 3, 4, 5};
		int result2 = method7(arr2); // 여기도 굳이 sum 아니어도 됨
		System.out.println(result2);
		// System.out.println(method7(arr2));
		
		String[] arr3 = method8("홍길동", "이순신");
		System.out.println( Arrays.toString(arr3));
		// System.out.println( Arrays.toString(method8("월", "화")) );
		
		
    } // end main
	
	
//		method6 / String / char[] / char배열의 요소를 문자열로 모두 붙여서 리턴
	static String method6(char[] arr) { // char[] arr 배열이 들어올 것이라고 확신
		String str = "";
		
		for(int i = 0; i < arr.length; i++ ) {
			str += arr[i];
		}
		return str;
	}
	
	
//		method7 / int / int[] / 배열의 요소의 합을 리턴
	static int method7(int[] arr2) {
		int sum = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		return sum;
	}
//	static int method7(int[] arr2) { // int a는 요소값
//		for(int a : arr) {
//			sum += a;
//		}
//		return sum;
//	}
	
	
//		method8 / String[] / String, String / 매개 변수를 배열에 저장하여 배열 리턴
	static String[] method8(String a, String b) {
		
		String[] arr = {a, b};
		return arr; // return에다가 변수명 걸어라
		}
		
	
}
