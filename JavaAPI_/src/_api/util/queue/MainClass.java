package _api.util.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import _api.util.stack.PersonVO; // 연결확인

public class MainClass {

	public static void main(String[] args) {
		//PrioirtyQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		
		//정수를 저장하는 PrioirtyQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(50);
		intQueue.offer(80);
		
		//데이터 꺼내기 - 실제로는 정렬을 하면서 저장하는게 아닌 트리형식으로 진행됨(정렬한 것처럼 보임), 컴퓨터가 옮기면서 진행하니 저장하는 속도는 느려짐
		//tree형식으로 데이터가 들어가면 실제로 어떤 형태로 나올지는 우리가 예측하기 어려움
		//poll하면 크기 순서대로 나옴
		System.out.println(intQueue.poll()); //50
		System.out.println(intQueue.poll()); //80
		System.out.println(intQueue.poll()); //100
		System.out.println(intQueue.poll()); //Overflow 발생, null 출력
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//이 상태에서 만들면 PesonVO의 크기 비교를 할 수 없기 때문(정렬이 안되어 있음)에 예외 발생
		//PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		//PersonVO 클래스에 Comparable 인터페이스를 implements하고
		//compareTo 라는 메서드를 재정의해서 해결할 수 있고
		
		//이 방법 추천
		//Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를
		//구현한 클래스의 인스턴스를 이용해서 생성해도 됩니다.
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				return o1.getBirthday().compareTo(o2.getBirthday()); // 생일순으로 오름차순
			}
			
		});
		persons.offer(new PersonVO(3, "지수", new Date(94,11,6), "010-0000-0000", "jisoo@gmail.com"));
		persons.offer(new PersonVO(4, "리사", new Date(96,10,3), "010-1111-1111", "lisa@gmail.com"));
		persons.offer(new PersonVO(5, "비비", new Date(92,8,25), "010-2222-3333", "bibi@gmail.com"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
	}
}
