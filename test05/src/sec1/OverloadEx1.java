package sec1;

public class OverloadEx1 {
	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.print();
		pro1.print(300,50);
		pro1.print(80);
		pro1.print("블라우스");
	}
}
