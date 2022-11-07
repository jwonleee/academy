package day06.overload;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(1);
		b.input("a");
		b.input("a",10);
		b.input(10,"a");
		b.input(3.14, 6.28, 10);
		b.input(100, 100, 10);
		
//		인트배열, 실수배열, 문자열배열
		
		
	}
}
