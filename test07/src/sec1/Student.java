package sec1;
//객체 배열
//필드: 번호, 국어, 영어, 수학점수
//메소드: getter, setter 및 총점, 평균, 함검, 모든 정보 출력
public class Student {
		int num;
		int kor;
		int eng;
		int mat;
		int avg;
		String hak;
		
		public int tot (){
			return (this.kor+this.eng+this.mat);
		}
		public double avg() {
			return (this.tot()/3.0f);
		}
		
		public String hak() {
			String h="F";
			if(this.avg()>=90) h="A";
			else if(this.avg()>=80) h ="B";
			else if(this.avg()>=70) h ="C";
			else if(this.avg()>=60) h ="D";
			else h ="F";
			return h;
		}
		
		public void print () {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",this.num,this.kor,this.eng,this.mat,this.tot(),this.avg(),this.hak());
		}
		
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMat() {
			return mat;
		}
		public void setMat(int mat) {
			this.mat = mat;
		}
		public int getAvg() {
			return avg;
		}
		public void setAvg(int avg) {
			this.avg = avg;
		}
		public String getHak() {
			return hak;
		}
		public void setHak(String hak) {
			this.hak = hak;
		}
		
		@Override
		public String toString() {
			return "Student [num=" + num + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", avg=" + avg + ", hak="
					+ hak + "]";
		}
}
