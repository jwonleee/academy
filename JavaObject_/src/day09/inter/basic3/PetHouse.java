package day09.inter.basic3;

public class PetHouse {

//	1. IPet타입을 매개변수로 받아서 기능을 출력하는 static 메서드
	public static void house(IPet p) {
		p.play();
	}
	
		
//	2. IPet[] 타입을 받아서, 배열 내무 Pet들의 play기능을 실행하는 메서드
	public static void house2(IPet[] arr) { // 배열이니까 매개변수도 배열로 맞추기
		for(IPet i : arr) {
			i.play();
		}
		
//		기본 for문으로 선언
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].play();
//		}
	}
	
}
