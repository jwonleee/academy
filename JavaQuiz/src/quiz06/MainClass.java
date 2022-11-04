package quiz06;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.add(10);
		cal.circle(5);
		
		
		System.out.println("------------------------------");
		
		
		Computor com = new Computor();
		
		//반환 있으니까 바로 가능
		System.out.println( com.circle(10) );
		
		com.rec(10);
		com.rec(10, 10);
		com.rec(10, 10, 10);
		
	}
}
