package org.kh.java;

public class Variable6 {
	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
		int kor=90, eng=80, mat=90;
		//float avg = (kor + eng + mat) / 3; <-(평균을 구할때는 정수(정수가 정수로 구하기 때문에 답도 정수로만 나온다.) 따라서 정수가 아닌 실수로 구하거나 앞에 (float)를 넣는다.
		//float avg = (kor + eng + mat) / 3.0f; (방법1)
		float avg = (float) (kor + eng + mat) / 3; //(방법2)
		
		
		System.out.printf("\nf1=%.3f", f1);
		System.out.printf("\nf2=%.2f", f2);
		System.out.printf("\n평균 : %.2f", avg);
	}
}
