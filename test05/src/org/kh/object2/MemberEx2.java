package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {
	public static void main(String[] args) {
		Member mem= new Member();
		mem.setId("tjdgk2019");
		mem.setPw("*******");
		mem.setEmail("tjdgk2019@naver.com");
		mem.setBirth(950219);
		mem.setTel("010-4687-196");

		System.out.println("id : "+mem.getId()); // 각각 하나를 출력하고 싶을 때
		System.out.println("pw : "+mem.getPw());
		System.out.println("email : "+mem.getEmail());
		System.out.println("birth: "+mem.getBirth());
		System.out.println("tel: "+mem.getTel());
		System.out.println(mem.toString()); //전체 다 출력하고 싶을 때
	}
}
