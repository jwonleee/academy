package day05;

public class Tv {

	String model;
	String color;
	int size;
	
	Tv() {
	}
	
	Tv(String pModel, String pColor, int pSize) { // 인위적으로 생성한 생성자
		model = pModel;
		color = pColor;
		size = pSize;
	}
		
		
		
	void info() {
		System.out.println("---- TV 정보 ----");
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("크기: " + size + "인치");
	}
		
	
	
	void info2(int a, int b) {
		System.out.println("---- TV 기능 정보 ----");
		System.out.println("채널 수: " + a);
		System.out.println("볼륨 최대: " + b);
	}
	
	
	
	String info3(int c) {
		System.out.println("---- 현재 상태 ----");
		if(c == 0) {
			return "꺼졌습니다";
		} else {
			return "켜졌습니다";
		}
	}
	
//	선생님 풀이
	
//	String company;
//	int ch;
//	boolean power;
//	
//    // 생성자
//		Tv() { }
//	
//		Tv(String a, int b, boolean c) { // 인위적으로 생성한 생성자
//			company = a;
//			ch = b;
//			power = c;  
//		}
//    
//    // 메서드1
//        boolean power() {
//            if(power) { 
//                system.in.println("전원 Off");
//                power = false;
//            } else {
//                system.in.println("전원 On");
//                power = true;
//            }
//            return power;
//        
//	// 메서드2
//        int changeCh(int num) {
//            ch = num; // 채널변경
//            system.in.println(ch + "번 변경");
//            return ch;
//        }

}