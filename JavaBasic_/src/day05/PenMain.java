package day05;

public class PenMain {

	public static void main(String[] args) {
		
//		펜의 기능을 사용할때는 객체로 생성하고, 참조연산자 .을 사용합니다.
		Pen pen = new Pen(); // new 날릴때마다 class 계속 만들어짐
		
		pen.color = "검정";
		pen.price = 1000;
		pen.company = "모나미";
		pen.write();
		pen.info();
		
		
		Pen red = new Pen();
		pen.color = "빨강";
		pen.price = 2000;
		pen.company = "모나미";
		pen.write();
		pen.info();
		
		
		Calculator cal = new Calculator();
		cal.add(1000);
		cal.add(2000);
		
	}
}
