package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
		String[] arr3 = {"일", "이", "삼", "사", "오"};
		
		PrintArray pa = new PrintArray();
		
		System.out.println(pa.toArray(arr));
		System.out.println(pa.toArray(arr2));
		System.out.println(pa.toArray(arr3));
		
		
	}
	
}
