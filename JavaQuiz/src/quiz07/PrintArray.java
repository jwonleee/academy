package quiz07;

import java.util.Arrays;

public class PrintArray {

	
	String toArray(int[] arr) { // 요소 반복해서 문자열 더하기 해서 붙여줘야함
		
		String str = "[";
		for(int i = 0; i < arr.length ; i++) {
			str += arr[i];
			
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		return str;
	}
	
	String toArray(char[] arr) {

		
		String str = "[";
		for(int i = 0; i < arr.length ; i++) {
			str += arr[i];
			
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		
		return str;
	}
	
	String toArray(String[] arr) {
		
		String str = "[";
		for(int i = 0; i < arr.length ; i++) {
			str += arr[i];
			
			if(i == arr.length-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		return str;
	}
	
//	이거랑 기능 같음
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3};
//		String result = Arrays.toString(arr);
//		System.out.println(result);
//	}
	
	
}
