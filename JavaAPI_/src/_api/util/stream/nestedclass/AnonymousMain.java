package _api.util.stream.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

//메서드가 1개인 인터페이스
interface Sample{
	//추상 메서드 선언
	public void display();
}


//인터페이스를 구현한 클래스
class SampleImpl implements Sample{
	@Override
	public void display() {
		System.out.println("클래스를 만들어서 사용");
	}
}


public class AnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		//인스턴스를 여러 개 만들어야 한다면 클래스를 만드는 것이 효율적
		Sample sample = new SampleImpl();
		sample.display();
		
	}
}
