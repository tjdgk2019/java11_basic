package org.kh.app;
//조건문 if : if(조건식) {처리할문장;}		//(단,처리할 문장이 한 줄인 경우 중가로{}를 생략할 수 있다.)
public class Condition1 {

	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		//판정(pass)는 점수{point}가 70점 이상이면, "합격" 아니면 "불합격"
		if (point>=70) pass="합격";
		/*
		 if (point>=70) {
		 pass="합격";
		 }
		 */
		//if (point>=70) {pass="합격";}
		System.out.printf("\n당신의 점수는 %d이며, 판정은 %s입니다.",point, pass);
		String pass2= (point>=70)?"합격":"불합격";
	}
}
