package sec3;

public class SingletonEx {
	public static void main(String[] args) { 	//싱글톤: 하나의 객체만 생성하는 걸 허용한다.
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println((s1==s2)+":"+(s2==s3));
	}
}