package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		
		/*
		 * ABC -> 한글자 char 배열에 저장
		 */
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String str = Scan.next();
		
		
		char[] arr = new char[str.length()]; // 근본 방법
		for(int i = 0; i < str.length(); i++) {
//			System.out.print(str.charAt(i) + " ");
			arr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		
		
		char[] arr2 = str.toCharArray(); // 빠른 방법
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			}
		
		System.out.println();
		
		/*
		 * 두 문자열을 입력받습니다.
		 * 첫 입력에 알파벳이 주어집니다.
		 * 두번째 입력에는 알파벳으로 만들어진 문자열이 주어집니다.
		 * -> B
		 * -> SDALVBSKBNSDSNDB
		 * 
		 * 첫번째 입력된 알파벳이 두번째 입력에 몇개 포함되어 있는지 출력.
		 * 배열로 바꿔서 출력해도 되고,
		 * 한글자씩 뜯어서 출력해도 됨.
		 */
		
		// 문자열 다루기 -> 문자열, 문자 (둘 중에 하나를 바꿔서 똑같이 만들어줌)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("알파벳: ");
		String alp = scan.next();
		
		System.out.print("문자열: ");
		String st = scan.next();
		
		char c = alp.charAt(0); // 입력한 알파벳(하나니까 인덱스0)을 char로 바꿔준것 		
		int count = 0;
		for(int i = 0; i < st.length(); i++) {
		     System.out.println(st.charAt(i)); // 한글자씩 쪼개기
			
			if(st.charAt(i) == c) // st는 문자 != alp는 문자열이니까 맞춰줌
			count++;
		}
		
		System.out.println(count);
		
	
	}
}
