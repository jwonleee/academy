package _api.util.arrays;

//어떤 종류의 데이터든지 생성자에서 개수에 상관없이 받아서 처리하는 제너릭스
class Generics <T> { //미지정 자료형 대부분 한글자를 대문자로 씀
	private T [] data;
	
	//...은 varialbe args로 개수에 상관없이 매개변수를 받고자 할 때 사용
	//받은 매개변수들은 배열로 만들어짐
	public Generics(T ... n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}


public class TempleteProgramming02 {

	public static void main(String[] args) {
		//제너릭이 적용된 클래스의 인스턴스 만들기 - 자료형 결정 필수!!!
		Generics <String> g1 = new Generics<String>("Karina", "Suzi", "IU");
		g1.display();
		
		Generics <Integer> g2 = new Generics<>(100, 200, 300, 400);
		g2.display();
	}
}
