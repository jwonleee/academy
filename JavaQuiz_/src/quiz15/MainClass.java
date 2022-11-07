package quiz15;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		바깥에 객체생성: 재황용하려고, while문 안에 들어가면 돌때마다 새롭게 됨
		SongList s2 = new MelonMusic();
		
		while(true) {
			System.out.println("메뉴[1.추가, 2.재생, 3.개수, 4.종료]");
			System.out.print("> ");
			
			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.print("노래> ");
				scan.nextLine();
				String name = scan.nextLine();
				s2.insertList(name);
			} else if(num == 2) {
				s2.playList();
			} else if(num ==3) {
				int len = s2.playLength();
				System.out.println("재생곡 개수: " + len);
			} else {
				System.out.println("종료");
				scan.close();
				return;
			}
		}
		
//		내 풀이
//		SongList s = new BugsMusic();
//		s.insertList("Solo");
//		s.playList();
//		s.playLength();
//		
//		System.out.println();
//
//		SongList s2 = new MelonMusic();
//		s2.insertList("Pink Venom");
//		s2.insertList("불장난");
//		s2.insertList("블랙핑크");
//		s2.playList();
//		System.out.println(s2.playLength());
		
	}
}
