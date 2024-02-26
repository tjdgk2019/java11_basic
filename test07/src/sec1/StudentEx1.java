package sec1;

import java.util.Scanner;
public class StudentEx1 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.num=1;
		s1.kor=90;
		s1.eng=90;
		s1.mat=90;
		
		Student s2=new Student();
		s2.num=2;
		s2.kor=80;
		s2.eng=70;
		s2.mat=60;

		System.out.println("학생 번호: "+s1.num+" 총점: "+s1.tot()+" 평균은: "+s1.avg());
		System.out.println("\n학생 번호: "+s2.num+" 총점: "+s2.tot()+" 평균은: "+s2.avg());
		
		//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키보드로 입력받아 총점, 평균, 학점을 계산하여 아래와 같은 출력 형태로 출력하도록 하는 프로그램을 작성하시오.
		/*
		 * 번호 국어 영어 수학 총점  평균 학점
		 *  1  90  90  90 270  90  A
		 *  2  80  70  60 210  70  C
		 *  3  90  80  70 240  80  B
		 *  4  60  90  70 220 73.3 C
		 *  5  70  90  90 240 83.3 B
		 */
		
		Student[]s= new Student [5]; // 5명의 학생 배열 객체 선언
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		for(int i=0;i<5;i++) {
			s[i] = new Student();	//개별 객체 생성
			s[i].setNum(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			s[i].setKor(scan.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			s[i].setEng(scan.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			s[i].setMat(scan.nextInt());
		}
		
		System.out.print("\t번호\t국어\t영어\t수학\t총점\t평균\n");
		for(int i=0;i<5;i++) {
			s[i].print();
		}
	}
	
}
