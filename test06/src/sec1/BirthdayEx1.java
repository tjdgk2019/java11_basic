package sec1;

public class BirthdayEx1 {

	public static void main(String[] args) {
		Birthday b =new Birthday();
		b.setName("이성하");
		b.setYear(1995);
		b.setMonth(2);
		b.setDay(20);
		b.birth();
		b.badd();
		
		Birthday b2 =new Birthday();
		b2.setName("LEE");
		b2.setYear(1994);
		b2.setMonth(2);
		b2.setDay(6);
		b2.birth();
		b2.badd();
	}
}
