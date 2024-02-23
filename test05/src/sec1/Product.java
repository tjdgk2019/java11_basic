package sec1;
public class Product {
			private String name;
			private int code;
			private int size;
			private int price;
			private int amount;
			private String remark;
			/* 메소드 오버로딩 (Method Overload) 상속과 전혀 관계고 없고 매개 변수의 개수나 타입에 따라서 메소드를 여러개 입력(기술)할 수 있는것. 
			 * 메소드 오버로딩, 메소드 오버라드에서 다 다른 입력을 한 것을 (메소드 오버로딩, 메소드 오버라이딩)의 다형성이라고 한다.
			 * 오버로드- 같은 이름으로 또 입력이 되어서 Load가 오버되는 것
			 * */
			public void print() {
				System.out.println("제품정보");
			}
			public void print(String name) {
				System.out.println("제품이름: "+name);
			}
			public void print(int size) {
				System.out.println("제품수치: "+size);
			}
			public void print(int price, int amount) {
				System.out.println("제품가격: "+price+"제품수량: "+amount);
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getCode() {
				return code;
			}
			public void setCode(int code) {
				this.code = code;
			}
			public int getSize() {
				return size;
			}
			public void setSize(int size) {
				this.size = size;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public int getAmount() {
				return amount;
			}
			public void setAmount(int amount) {
				this.amount = amount;
			}
			public String getRemark() {
				return remark;
			}
			public void setRemark(String remark) {
				this.remark = remark;
			}
			@Override // 오버라이드 특정 메소드를 상속받아서 실행할 내용을 진행하는 것.
			public String toString() {
				return "Product [name=" + name + ", code=" + code + ", size=" + size + ", price=" + price + ", amount="
						+ amount + ", remark=" + remark + "]";
			}
}
