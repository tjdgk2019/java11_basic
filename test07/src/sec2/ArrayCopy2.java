package sec2;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[]arr1= {80,70,65,90,85,95,60};
		int[]arr2= {5,3,8,7,6,4,2};
		int[]arr3= {5,3,8,7,6,4,2};
		for (int i=0;i<arr1.length;i++) {	//1:1전달-> 깊은 복제
			arr3[i] = arr1[i];
		}
		//arr3[2]=75; <- 하나씩 정해서 값을 수정해도 되지만 arraycopy로 한번에 수정할 수 있다.
		System.arraycopy(arr1,0,arr3,0,7);	//(원본배열,원본시작위치,복사배열,복사시작위치,개수);
		System.out.println("arr1"+arr1);
		System.out.println("arr2"+arr2);
		System.out.println("arr3"+arr3);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+":"+arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+":"+arr2[i]);
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(i+":"+arr3[i]);
		}
	}
}