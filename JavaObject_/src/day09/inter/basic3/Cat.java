package day09.inter.basic3;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("야옹이는 생선을 먹어요");
	}
	@Override
	public void play() {
		System.out.println("야옹이는 거실에서 놀아요");
	}
}
