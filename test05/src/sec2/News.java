package sec2;
//탑다운(Top down)의 생성자 함수 방식
public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String author;
	private String visited;

	public News() {
		this(1);
	}

	public News(int bno) {
		this(bno, "자바");
	}
	
	public News(int bno, String title) {
		this(bno, title, "이성하");
	}
	
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "초보자를 위한 자바 기초");
	}
	
	public News(int bno, String title, String uname, String content) {
		this(bno, title, uname, content, "Lee");
	}
	
	public News(int bno, String title, String uname, String content, String author) {
		this(bno, title, uname, content, author, "24-02-23");
	}
	
	public News(int bno, String title, String uname, String content, String author, String visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}
	
	
}
