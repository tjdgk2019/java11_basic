package sec1;

public class Book {
		private String bname;
		private int bno;
		private int price;
		private String author;
		private String pub;
		
		public void print(String bname) {
			System.out.println("책이름: "+bname);
		}
		public void print(int bno) {
			System.out.println("책번호: "+bno);
		}
		public void print(String pub, String author) {
			System.out.println("출판사: "+pub+"\t저자: "+author);
		}
		public void print(int price, int bno) {
			System.out.println("책가격: "+price+"\t책번호: "+bno);
		}

		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPub() {
			return pub;
		}
		public void setPub(String pub) {
			this.pub = pub;
		}
		
		@Override
		public String toString() {
			return "Book [bname=" + bname + ", bno=" + bno + ", price=" + price + ", author=" + author + ", pub=" + pub
					+ ", getBname()=" + getBname() + ", getBno()=" + getBno() + ", getPrice()=" + getPrice()
					+ ", getAuthor()=" + getAuthor() + ", getPub()=" + getPub() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
}
