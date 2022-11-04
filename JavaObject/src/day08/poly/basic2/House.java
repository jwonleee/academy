package day08.poly.basic2;

public class House { // 사용자 클래스 - Person을 매개변수로 사용
	
	/* 배열을 전달하라는 말이 아닙니다. 객체를 전달
	 * 1. 멤버변수로 크기가 100개인 Person배열을 선언
	 * 2. 배열의 순서를 사용할 count변수 선언
	 * 3. void setPerson(???/부모타입) 모든 자식클래스를 받을 수 있도록 선언하세요.
	 *    기능 - 멤버변수에 매개변수를 순서대로 저장되는 기능
	 *    
	 * 4. 메인클래스에서는 3명의 Person을 전달하세요.
	 */

	private Person[] arr = new Person[100]; //멤버변수
	private int count; // 초기값 0
	
	public void setPerson(Person p) { //Person은 변수타입이고, p는 임으로 넣은 변수이름
		arr[count] = p;				 // Person[] arr배열에 저장하려면 변수타입 같아야 함
		count++;
	}
//	틀림, 없어도 됨
//	public Person[] getPerson() {
//		return arr;
//	}
	
	//arr반환 get메서드
	public Person[] getArr() {
		return arr;
	}
}
