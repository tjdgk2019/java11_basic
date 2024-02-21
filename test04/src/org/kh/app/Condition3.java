package org.kh.app;
import java.util.Scanner;

//조건문 if~elseif(~else~)
public class Condition3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0-100]:");
		int point = scan.nextInt();
		char result;
		//학점(result)은 점수(point)가 100~90이면 'A', 80~89이면 'B', 70~79는 'C', 60~69이면'D', 60미만이면 'F'
		
		if(point>=90) {result='A';} else if(point>=80) {result='B';} else if(point>=70) {result='C';} else if(point>=60) {result='D';} else{result='F';} 
		System.out.printf("\n당신의 점수는 %d점입니다.\n", point);
		//System.out.println("당신의 점수는 : " +point+);
		
		System.out.printf("\n당신의 학점은 %s 입니다.\n", result);

	}
}
