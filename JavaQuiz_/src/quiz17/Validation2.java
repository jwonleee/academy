package quiz17;

public class Validation2 {
	 /* 문제2
		1. String palindromeCheck(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
		2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
		3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
		4. 문장은 공백을 포함하여 받을 수 있습니다.
		5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
		6. 힌트)
		* 함수를 이용하여 공백을 제거하세요. 힌트: replace() 
		* 문장의 길이의 중간값을 구하세요. 
		* 첫문장과, 마지막문장을 비교하며 중간으로 이동
		* for문에서 charAt()을 사용해서 반대로 잘라 붙이세요. (or 빌더를 이용 하여 문자를 뒤집어 비교)
	*/
	
	public static void main(String[] args) {
		
		Validation2 val = new Validation2();
		System.out.println(val.palindromeCheck("다 같은 것은 같다"));
		
	} // main의 끝
	
	
	public static String palindromeCheck(String word) {
		
		String b = word.replace(" ", "");
		int mid = b.length() / 2;
//		System.out.println(mid);
		int end = b.length()-1;
		
		char[] arr = b.toCharArray();
		String answer = "회문입니다";
	
		for(int i = 0 ; i < mid; i++) {
			if(arr[i] != arr[end]) {
				answer = "회문이 아닙니다";
				break;
			} 
			end--;
		}
		return answer;
	}
	
//	  검색) stringBuilder의 reverse() 사용
//	  public static void Solution(String str){
//        // 대소문자 구분하지 않기 위함
//        str = str.toLowerCase(Locale.ROOT);
//
//        StringBuilder builder = new StringBuilder(str).reverse();
//        if(builder.toString().equals(str)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//	main에서
//	Scanner in=new Scanner(System.in);
//	String input = in.next();
//	
//	Solution(input);
	
}
