package api.util.generic;

public class ABC<T> { //클래스 안에서 타입(T)처럼 사용 가능
	
	private int def; //int형도 사용 가능 
	private T abc;

	public T getAbc() {
		return abc;
	}

	public void setAbc(T abc) {
		this.abc = abc;
	}
	
}