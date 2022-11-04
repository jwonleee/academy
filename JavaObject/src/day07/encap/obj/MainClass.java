package day07.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
//		호텔클래스 사용
		Hotel hotel = new Hotel();
		
//		hotel.setChef(new Chef()); // setter들어가면 Chef chef = new Chef()임
		
		Chef chef = new Chef(); // 위에 한줄과 같음
		hotel.setChef(chef); // →chef클래스를 사용할건데 hotel의 setChef메서드에 넣겠다?
		
//		getter
		Chef c = hotel.getChef();
		c.cooking();
		
		System.out.println(chef == c); // true
	
	}
}
