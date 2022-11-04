package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class QuizA_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		
		String row = scan.nextLine();
		int a0 = Integer.parseInt(row.split(" ")[0]);
		int a1 = Integer.parseInt(row.split(" ")[1]);
		int a2 = Integer.parseInt(row.split(" ")[2]);
		int a3 = Integer.parseInt(row.split(" ")[3]);
		int a4 = Integer.parseInt(row.split(" ")[4]);
		int a5 = Integer.parseInt(row.split(" ")[5]);
		int a6 = Integer.parseInt(row.split(" ")[6]);
		int a7 = Integer.parseInt(row.split(" ")[7]);
		int a8 = Integer.parseInt(row.split(" ")[8]);
		int a9 = Integer.parseInt(row.split(" ")[9]);
		
		
		int[] arr = {a0, a1, a2, a3, a4, a5, a6, a7, a8, a9};
		System.out.println(Arrays.toString(arr));
		
		int index = 0;
		int answer = 0;
		
		for(int i = 1; i <3; i++) {
			answer = arr[index];
			index = answer;
		}
		
		System.out.println(arr[index]);
		
		
	}
}
