package org.kh.app2;

public class Loop3 {

	public static void main(String[] args) {
		int[] nums= {50,60,75,80,90,100,45,90,95,85};
		/*
		 * 중요한 자바 1.6이상의 개선된 for문
		 */
		for(int n:nums) {
			if(n>=80) System.out.println(n+"합격");
			else System.out.println(n+"불격");
		}
		nums[10]=66;
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+"="+nums[i]);
		}
	}
}
