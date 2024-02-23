package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class Starprint {
	public static void main(String[] args) {
		/*
		 ******
		 ******
		 ******
		 ******
		 */
		/*
		for (int i=0;i<4;i++) {
			for (int j=0;j<6;j++){ //0~5 ->6
			System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for (int a=0;a<6;a++) {
			for (int b=0;b<a;b++) {			
				System.out.print("*");
			}
			System.out.println("");
		}
		/*
		for (int a=0;a<6;a++) {
			for (int b=a-0;b<6;b++) {			
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		for (int i=0;i<=6;i++) {
			for (int j=0;j<6-i;j++) {			
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
