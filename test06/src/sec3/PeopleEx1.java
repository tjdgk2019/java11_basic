package sec3;

public class PeopleEx1 {
	public static void main(String[] args) {
		People p1= new People();
		p1.selNum=200;		//people.selNum=200과 동일-> 클래스 변수==정적 필드==공유데이터
		p1.name="이성하";		//인스턴스 변수==동적 필드
		p1.age=29;
		p1.addr="마장동";
		
		People p2= new People();
		p2.selNum=300;		//people.selNum=300과 동일
		p2.name="박동빈";
		p2.age=45;
		p2.addr="안암동";
		
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		System.out.println("selNum : "+p1.selNum);
		System.out.println("name : "+p2.name);
		
		System.out.println("정적 메소드==클래스 메소드");
		//정적 요소: static으로 선언된 필드 또는 메소드, 객체의 생성없이 활용가능
		//정적 메소드: 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
	}
}
