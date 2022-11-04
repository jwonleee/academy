package quiz15;
public class MelonMusic implements SongList{

	private String[] list = new String[100];
	private int count = 0;
	
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	@Override
	public void insertList(String song) {
//		반복문 사용하면 한번 쓸 때 배열 100개에 그것만 다 들어감	
		list[count] = song;
			count++;
		}	
	
	@Override
	public void playList() {
		
//		곡이 없을 때 없다고 출력
		if(count == 0) {
			System.out.println("곡이없음");
			return;
		} 
		
		for(int i = 0; i < count; i++) {
			int ran = (int)(Math.random()*count);
			System.out.println(list[ran]);
			
//		랜덤한 한곡만 출력	
//		int song = 0;
//		for(int i = 0; i < count; i++) {
//			int ran = (int)(Math.random()*count);
//			song = ran;
//		} 
//		System.out.println("현재곡: " + list[song]);
			
		}
	}
	
	@Override
	public int playLength() {
		return count;
	}
	
}
