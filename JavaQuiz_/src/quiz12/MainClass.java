package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		// 카트객체
		MyCart mc = new MyCart(2000);
		
//		Tv t = new Tv();
//		mc.buy(t); 아래의 한줄과 같음
		
		mc.buy(new Radio()); // 넣어보면 Product p = new Tv();와 같음
		mc.buy(new Tv());
		mc.buy(new Computer());
	}
}
