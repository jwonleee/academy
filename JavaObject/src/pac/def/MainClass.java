package pac.def;

import java.util.Scanner;

//import pac.abc.Apple; // 패키지명을 포함한 클래스명
//import pac.abc.Banana;
import pac.abc.*; // 전부 다 사용

public class MainClass {

	public static void main(String[] args) {
		
		Melon m = new Melon();
		Apple a = new Apple();
		Banana b = new Banana();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(m);
		System.out.println(new int[3]);
	}
}
