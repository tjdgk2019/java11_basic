package sec1;

public class BookEx_ {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setAuthor("이성하");
		book1.setBname("자바");
		book1.setPrice(4800);
		book1.setBno(10);
		book1.setPub("믿음출판사");

		Book book2 = new Book();
		book2.setAuthor("LEE");
		book2.setBname("정보처리 기사");
		book2.setPrice(5400);
		book2.setBno(8);
		book2.setPub("한빛 미디어");
		
		Book book3 = new Book();
		book3.print(book1.getPrice(),book1.getBno());
		book3.print(book2.getPrice(),book2.getBno());
		book3.print(book1.getBname());
		book3.print(book2.getAuthor());
	}
}