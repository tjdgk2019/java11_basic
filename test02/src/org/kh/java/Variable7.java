package org.kh.java;

public class Variable7 {
	public static void main(String[] args) {
		String name = "이성하";
		//Integer age = 29;
		Integer age = 29;
		String age2 = "29";
		int age3 = Integer.parseInt(age2) + 8;
		Float height = 161.8f;
		String height2 ="173.6f";
		float height3 = Float.parseFloat(height2);
		
		//boolean pass = true;
		Double weight = 72.3;
		
		
		System.out.println("age : "+age3);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+name.getClass().getName());
		System.out.println("height : "+name.getClass().getName());
		System.out.println("weight : "+name.getClass().getName());
		//primitive type->wrapper type = boxing (원래는 기본타입인데 클래스처럼 보이기 위해 포장한다.)
		//wrapper type-> primitive type = unboxing
	}
}
