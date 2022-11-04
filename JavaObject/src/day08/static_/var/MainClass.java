package day08.static_.var;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("일반변수: " + c1.a); // 1
		System.out.println("정적변수: " + c1.b); // 1
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수: " + c2.a); // 1
		System.out.println("정적변수: " + c2.b); // 2
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수: " + c3.a); // 1
		System.out.println("정적변수: " + c3.b); // 3
		
//		지금 c1.b는 몇일까? 3 객체들마다 똑같은 값을 가짐
//		지금 c2.b는 몇일까? 3
		
//		static은 객체 생성 없이 바로 접근 가능하다.
		Count.b++; // 4 윗부분이 하나도 없어도 가능
		
	}
}
