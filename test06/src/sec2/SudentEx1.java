package sec2;

public class SudentEx1 {

	public static void main(String[] args) {
		Student s1 =new Student("이성하",1,100000);
		Student s2 =new Student("아무개",2,200000);
		Student s3 =new Student("김갑수",3,300000);
		Student s4 =new Student("이원석",4,400000);
		
		Bus bus1=new Bus(100);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		//이원석 학생이 버스101번 버스를 두 번 이용하고, 지하철을 2호선을 세번 이용하였을 경우
		//이원석 학생의 정보와 버스 101번 정보와 지하철 2호선의 정보를 출력하여라.
		Bus bus2=new Bus(101);
		Subway sub2=new Subway(2);
		s4.takeBus(bus2);
		s4.takeBus(bus2);
		s4.takeSubway(sub2);
		s4.takeSubway(sub2);
		s4.takeSubway(sub2);
		s4.print();
		bus2.show();
		sub2.show();
	}
		
}
