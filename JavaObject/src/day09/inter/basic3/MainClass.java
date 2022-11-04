package day09.inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
//		Dog d = new Dog(); // eat, play
//		Animal d = new Dog(); // eat
		IPet d = new Dog(); // play
//		위의 세줄이 다형성임
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
//		1. Animal배열에 저장
		Animal[] arr = {baduk, nabi, hodol };
		for(Animal a: arr) { // Animal타입 a을 배열에 넣어주기
			a.eat();
		}
		
//		2. baduk은 Animal이지만 생성된 클래스가 인터페이스 상속을 받고 있다면, 상호형변환이 됩니다.
		
		IPet i1 = (IPet)arr[0]; // 바둑
		IPet i2 = (IPet)nabi; // 나비
		IPet i3 = new GoldFish();
		IPet[] arr2 = {i1, i2, i3};
		
		for(IPet i: arr2) { // IPet타입 i를 배열에 넣어주기, 기본 for문도 사용해보기
			i.play();		// 메서드 호출할 때 . 사용
		}
		
//		3. PetHouse
		PetHouse.house(i1); // static 썼기 때문에 클래스이름.메서드 이름 사용
		PetHouse.house(i2);
		PetHouse.house(i3);
		PetHouse.house2(arr2);
	}
}
