package _api.util.stream.nestedclass;

interface Sample2{
	public void display();
}

public class AnonymousMain2 {

	public static void main(String[] args) {
		new Sample2() {
			@Override
			public void display() {
				System.out.println("클래스를 생성하지 않고 사용");
			}
		}.display();
	}
}
