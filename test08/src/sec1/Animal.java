package sec1;

public class Animal {

		private String name;
		private boolean spine;
		private int leg;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isSpine() {
			return spine;
		}
		public void setSpine(boolean spine) {
			this.spine = spine;
		}
		public int getLeg() {
			return leg;
		}
		public void setLeg(int leg) {
			this.leg = leg;
		}

		public String print() {
			return "Animal [name=" + name + ", spine=" + spine + ", leg=" + leg + "]";
		}
		
		
		
		


}
