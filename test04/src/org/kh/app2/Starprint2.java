package org.kh.app2;

public class Starprint2 {

	//1번째 문제
	public static void main(String[] args) {
		for(int i=0;i<4;i++){
		for(int j=0;j<6;j++){
			System.out.print("*");
		}
		System.out.println("");
		}

		//2번째 문제
		for(int i=0;i<6;i++) {		//i=i+1
			for(int j=0;j<i;j++) {  //j=j+1
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3번째 문제
		for(int i=0;i<6;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
