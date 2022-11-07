package _api.util.stack;

import java.util.Date;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 Stack을 생성
		Stack<PersonVO> stack = new Stack<>();
		//Stack에 데이터 저장 - push
		stack.push(new PersonVO(1, "제니", new Date(95,5,5), "010-1234-5678", "jennie@gmail.com"));
		stack.push(new PersonVO(2, "로제", new Date(98,6,7), "010-8765-4321", "rose@gmail.com"));
		
		//Stack에서 데이터 꺼내기, 순서 확인
		System.out.println(stack.pop()); //로제
		System.out.println(stack.pop()); //제니
		System.out.println(stack.pop()); //Underflow 발생
		//데이터가 2개 존재해서 2번 pop을 하면 모두 제거된 상태인데
		//pop을 수행해서 Underflow 발생 - 프로그램에서는 예외 발생
		//System.out.println(stack.pop());
		
	}
}
