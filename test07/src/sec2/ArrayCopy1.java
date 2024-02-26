package sec2;

//얕은 복사 : arr2=arr1=>주소가 같아지기 때문에 arr1의 요소 또는 arr2의 값을 변경하면 전부 변경되는 특성을 갖는다.
public class ArrayCopy1 {

	public static void main(String[] args) {
		int[]arr1= {80,70,65,90,85,95,60};
		int[]arr2= {5,3,8,7,6,4,2};
		int[]arr3;
		System.out.println(arr1);
		System.out.println(arr2);
		//arr2의 내용은 arr1를 복사하여 대입하라.
		arr2=arr1;		//얕은 복사-연결되어 있어 하나의 값만 바꿔도 다른 것도 동일하게 다 바뀐다.(Static과 동일)
		arr3=arr1;
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+":"+arr2[i]);
		}
	}
}
