package org.kh.app2;

public class Loop2 {
	public static void main(String[] args) {
		/*
		int [] ns = {9,12,3,7,6,8,10,11};
		int max=0;
		for(int i=0;i<8;i++) {
			if(ns[i]>max) max=ns[i];
		}
		int min=13;
		for(int i=0;i<8;i++) {
			if(ns[i]<min) max=ns[i];
		}
		*/ //이렇게 두개 반복해서 써도 되지만 둘을 하나로 합쳐도 괜찮다.
		
		int [] ns = {9,12,3,7,6,8,10,11};
		int max=0, min=13;
		for(int i=0;i<8;i++) {
			if(ns[i]>max) max=ns[i];
			if(ns[i]<min) max=ns[i];
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);		
	}
}
