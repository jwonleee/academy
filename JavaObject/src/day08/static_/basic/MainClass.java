package day08.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
//		PrintArray pa = new PrintArray(); 객체 생성 불가
		
//		System.out.println(pa.toArray(arr));
		
		System.out.println(PrintArray.toArray(arr));
		
	}
	
}
