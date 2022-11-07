package _api.util.arrays;

import java.util.Arrays;

public class CollectionTest1 { // 추가 & 삭제, 중간부분 삭제 해보자!

	public static void main(String[] args) {
		String[] arr = {"List", "Set", "Map"};
		
		//배열의 데이터를 수정하는 것은 가능
		arr[2] = "HashTable";
		System.out.println(Arrays.toString(arr));
		
		//arr 배열에 데이터를 추가
		//arr 배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String[] arr2 = new String[arr.length + 1];
		
		//arr의 내용을 복사
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		//arr2의 마지막에 데이터 추가
		arr2[arr2.length - 1] = "Properties";
		//arr2가 가리키는 곳을 arr이 가리키도록 함
		arr = arr2;
		System.out.println(Arrays.toString(arr));
		
	}
}
