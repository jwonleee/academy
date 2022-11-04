package day08.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton instance = new Singleton(); 2번하면 막힘
		
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println( s == s2 && s2 == s3 ); //  true
		
//		동일한 변수가 사용됩니다.
		s.site = "이순신";
		System.out.println(s.site); // 이순신
		System.out.println(s2.site); // 이순신
		System.out.println(s3.site); // 이순신
	}
}
