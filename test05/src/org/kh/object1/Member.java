package org.kh.object1;
//회원(Member) 클래스를 작성하되, 아이디(id), 비밀번호(pw),이메일 email, birth, tel 등의 요소로 하고,회원정보를 (모든 요소)출력하는 메서드를 작성하시오.
//public> protected> 		default> private(정보은닉)
//*(all)> 동일 패키지/상속/연관> 동일 패키지> 현재클래스
// 매개변수는 임시기억장소
public class Member {
		public String name;		//private 개인용이므로 같은 패키지나 다른 패키지로 실행해도 접근이 불가능하다.
		public String id;			//같은 패키지 외에 접근을 허용하기 위해서는 public을 써줘야 한다.(전체 공용)
		public String pw;
		public String email;
		public int birth;
		public String tel;
		//마우스 오른쪽 ->소스->generate getter and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getBirth() {
			return birth;
		}
		public void setBirth(int birth) {
			this.birth = birth;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		
		//특정값으로 저장할 수 있는 것을 섹터라고 한다. 또한 set할때는 카멜케이스로 적는다.
		//오른쪽 마우스 클릭->소스->generate to string
		@Override
		public String toString() { //메서드는 절대로 private를 걸지 않는다.
			return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth
					+ ", tel=" + tel + "]";
		}
}