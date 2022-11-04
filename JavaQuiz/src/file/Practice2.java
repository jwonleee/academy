package file;

public class Practice2 {

	public static boolean isNumber(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			if(str == null || str == "") {
				return false;
			}
			
			
			
			
			
			
		}
		
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));

	}
}
