package _api.thread;

public class DaemonThread {

	public static void main(String[] args) {
		//1부터 10까지 1초씩 딜레이하면서 출력해주는 스레드
		Thread th = new Thread(() -> {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				}catch(Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		//데몬 스레드로 설정 - 다른 작업이 없으면 자동을 종료
		th.setDaemon(true); //setDaemon(true) 1,2,메인 종료 끝
		th.start(); //위 줄 없으면 무조건 본인 작업 끝마침

		try {
			Thread.sleep(3000);
			System.out.println("메인 종료");
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
