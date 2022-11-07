package api.util.generic;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		ABC<String> abc = new ABC<String>(); //T에 String을 넣어서 선언
//		ABC<String> abc = new ABC<>(); 뒤 <>는 생략 가능
		
		abc.setAbc("gg");
		
		String s = abc.getAbc();
		System.out.println(s);
		
		ArrayList<String> a = new ArrayList<>(); //이렇게도 사용 가능
	
		
	}
}
