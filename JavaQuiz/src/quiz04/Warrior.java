package quiz04;

public class Warrior extends Player {
	//Player클래스로 상속관계를 만들어 주세요
	//전사는 생성될 때 ★이름만 매개변수로 받고, hp = 100, mp = 50이 됩니다.
	//전사는 강력한 bash()를 가지고 있습니다
	//bash()는 호출될떄마다 mp를 -10씩 감소시킵니다
	
	Warrior(String pName) { //생성자
		name = pName;
		hp = 100;
		mp = 50;
	}
	
	int bash() {
		System.out.println("이얍!");
		mp -= 10; // mp = mp - 10; 이랑 같음
		System.out.println("캐릭명:" + name + "\n" + "hp:" + hp + "\n" + "mp" + mp);
		return mp;
	}
}
