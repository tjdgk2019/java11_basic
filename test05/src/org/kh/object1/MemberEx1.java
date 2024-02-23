package org.kh.object1;

public class MemberEx1 {
	public static void main(String[] args) {
		Member lee= new Member(); 	//lee는 인스턴트 이름 = new Student는 생성자 함수 이름
		lee.name="이성하";
		lee.id="tjdgk2019";
		lee.pw="*******";
		lee.email="tjdgk2019@naver.com";
		lee.birth=950219;
		lee.tel="010-4687-1960";
		System.out.println(lee.toString());
	}
}