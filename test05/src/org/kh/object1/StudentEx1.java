package org.kh.object1;

public class StudentEx1 {
	public static void main(String[] args) {
			Student lee= new Student(); 	//lee는 인스턴트 이름 = new Student는 생성자 함수 이름
			lee.name="이성하";
			lee.kor=98;
			lee.eng=85;
			lee.mat=75;
			lee.resulting();
	}
}
