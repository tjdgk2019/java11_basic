package org.kh.app;

public class Condition5 {
	public static void main(String[] args) {
		/*
		 switch(변수명 아니면 기준값, 비교대상){
		 		case 값1:
		 		실행문1;
		 		beak;
		 		case 2:
		 		실행문2;
		 		beak;
		 		...
		 		case n:
		 		실행문n;
		 		beak;
		 		default:
		 			실행문n;
		 }
		 */
		int rank=1;
		String sisang = "";
		switch(rank) {
			case 1:
				sisang ="최우수상";
				break;
			case 2:
				sisang ="노력상";
				break;
			case 3:
				sisang ="아차상";
				break;
				 default:
				 sisang ="";
		}
		
		String remark ="";
		switch (rank) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			remark="우등생";
			break;
			default:
			remark="일반";		
		}
	}

}
