package sec1;

public class BookEx1 {
	//100개의 BOOK배열 선언
	public static void main(String[] args) {
		Book [] book=new Book[100];

		for(int i=0;i<10;i++) {
			book[i]=new Book("책 제목"+i,"저자"+i);
		}

		book[0]=new Book("자바 프로그래밍 입문","박은종");
		book[1]=new Book("HTML/CSS","전은철");
		book[2]=new Book("어린왕자","생텍쥐페리");
		book[3]=new Book("토지","박경리");
		book[4]=new Book("데미안","조정래");
		
		for(int i=0;i<5;i++) {
			System.out.println(book[i].toString());
		}
	}

}
