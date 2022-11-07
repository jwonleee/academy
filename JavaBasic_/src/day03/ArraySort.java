package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
//		정렬 -> 7가지 중 선택정렬, 퀵정렬, 
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				
//				if(arr[i] > arr[j]) {  // 내림차순 하고 싶으면 < 바꿔주면 됨
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			
//		}
		
		Arrays.sort(arr); // 퀵정렬
		
		System.out.println(Arrays.toString(arr));
		
	}
}
