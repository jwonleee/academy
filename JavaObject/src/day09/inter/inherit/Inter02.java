package day09.inter.inherit;

public interface Inter02 {

	void some3();
	default void some4() {
		System.out.println("디폴트 메서드");
	}
}
