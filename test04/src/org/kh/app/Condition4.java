package org.kh.app;

//조건문 다단계 if
import java.util.Scanner;
public class Condition4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0-100]:");
		int point = scan.nextInt();
		String result;
		/*
		 * 100~97이면 'A++', 96~93 A, 92~90 A-
		 *  89~87이면 'B++', 86~83 B, 82~80 B-
		 *  79~77이면 'C++', 76~73 C, 72~70 C-
		 *  69~67이면 'D++', 66~63 D, 62~60 D-
		 *  60미만이면, 'F'로 하되, 다단계 if와 if/else if/ else 문을 활용
		 */
		
		/*if (point>=97) {result="A+";}
		else if (point>=93) {result="A";} else if (point>=90) {result="A-";}
		else if (point>=87){result="B+";} else if (point>=83) {result="B";} else if (point>=80) {result="B-";}
		else if (point>=77){result="C+";} else if (point>=73) {result="C";} else if (point>=70) {result="C-";}
		else if (point>=67){result="D+";} else if (point>=63) {result="D";} else if (point>=60) {result="D-";}
		else {result="F";}
		System.out.printf("/n당신의 학점은 %s입니다.\n", result);
		*/
		if(point>=90) {
			result="A";
			if((point%10>=7 && point%10<=9) || point==100) {result=result +"+";}
			else if(point%10>=3 && point%10<=6) {result=result +"0";}
			else if(point%10>=0 && point%10<=2) {result=result +"-";}
			else {result="F";}
		}
		
		/*
		 * 시상내용은 학점이 A++이면, 학업우수상, A이면 노력상 A-이면 아차상으로 하고 나머지는 ''으로 하되 switsh ~case문 활용
		 */
		
		//switch(비교대상){case 값1:실행문; break; case 값2:실행문; break;.....case 값n:실행문; break; default; 실행문;}
		String remark="";
		switch(remark) {case "A+": remark="학업우수상"; break; case "A": remark="노력상"; break; case "A-": remark="아차상"; break; default: remark="";}
		
		System.out.println("당신의 점수 : " +point);
		System.out.println("당신의 점수 : " +result);
		System.out.println("당신의 수상 : " +remark);
		
	}

}
