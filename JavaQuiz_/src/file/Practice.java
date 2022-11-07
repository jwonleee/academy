package file;

import java.util.Arrays;

public class Practice {

	public static int[] shuffle(int[] arr) {
		
//		유효성 검사
//		if(arr==null  || arr.length==0) return arr;
		
		for(int i = 1; i < arr.length; i++) {
			int ran = (int)(Math.random() * 8) + 1;
			
			int tmp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
	
	
	
	
	
	
	
	
}
