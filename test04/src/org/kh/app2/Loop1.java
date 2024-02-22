package org.kh.app2;
//반복문: for, while, do~wile (같은 일을 여러번 실행할때 쓰는 것)
public class Loop1 {
	public static void main(String[] args) {
		/*조건식이 참일때만 계속 반복 수행한다.
		for(초기식;조건식;증감식){반복해야 할 문장;}
		①초기식 ②조건식 ③{} ④증감식 순으로 수행한다. 초기식은 처음 한번만 실행하고 이후에는 조건식 {} 증감식으로 계속 수행한다.
		반복수행을 하는 경우, 예시)게시판 글목록 출력 <- 반복문 중요하니 꼭 기억해라.
		[] 대가로는 열이 여러개라는 것을 의미한다.(=배열) int [] nums 는 nums가 하나가 아니고 하나 이상이라는 뜻
		"이름: "+names[i]<-에서 []대가로는 names는 [i]열에 속한다라는 의미
		
		for ①초기식→ ②조건식→ ③{}반복해야 할 문장→ ④증감식 | ②조건식→ ③{}→ ④증감식
		*/
		int n=0;
		for(int i=0;i<10;i++) { //0 1 2 3 4 5 6 7 8 9 10
			n=n+1;				//1 2 3 4 5 6 7 8 9 10
		}
		System.out.println("n="+n);
		/*
		int[] nums= {80,95,75,60,100,65,70,90,85,95}; //배열
		String[] names= {"김","이","박","최","정","오","배","강","장","계"};
		for(int i=0;i<10;i++) {
			System.out.print("이름 :"+names[i]+",");
			System.out.print("점수 :"+nums[i]+"\n");
			}
		*/	
			
		int[] nums= {50,60,75,80,90,100,45,90,95,85};
		String[] names= {"이", "김", "박", "최", "심", "장","유","오","임","전"};
		int tot=0;
		for (int i=0;i<10;i++) {
			tot += nums[i]; // tot = tot + nums[i];
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
		if(nums[i]>=90) {
			System.out.println("A\t");}
			else if (nums [i]>=80){
			System.out.println("B\t");}
			else if (nums [i]>=70) {
			System.out.println("C\t");}
			else if (nums [i]>=60) {
			System.out.println("D\t");}
			else {System.out.println("F\t");}
		if (nums[i]>=70) {
			   System.out.println("합격");	
			} else {
			   System.out.println("탈락");	
			}
		int max=100, min=0;
		if (nums[i]>max || nums[i]<min) {		
		System.out.println("전체총점 : "+tot);
		System.out.println("전체평균 : "+(tot/10.0f));
		System.out.println("최대점수 : ");
		System.out.println("최소점수 : ");
		}	
}
}	
}
