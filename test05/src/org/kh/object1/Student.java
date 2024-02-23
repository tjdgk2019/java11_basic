package org.kh.object1;

public class Student {
			String name;
			int kor=100;
			int eng=100;
			int mat=100;
			public int tot (){
				return kor+eng+mat;
			}
			double avg() {
				return (kor+eng+mat)/3.0f;
			}
			 void resulting() {
			 System.out.println("이름: "+this.name+", 총점: "+this.tot()+"평균은 :"+this.avg());
	}
}
