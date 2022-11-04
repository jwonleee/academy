package quiz15;

public class BugsMusic implements SongList{
	
	private String[] list = new String[100];
	private int count = 0;
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 */
	@Override
	public void insertList(String song) {
		System.out.println(song + "[곡을 추가하였습니다]");
	}
	@Override
	public void playList() {
		System.out.println("노래 리스트");
	}
	@Override
	public int playLength() {
		System.out.println("노래 개수");
		return 0;
	}
	
	
}
