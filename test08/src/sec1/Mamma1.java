package sec1;

public class Mamma1 extends Animal{
	private int leg;

	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public String print() {
		return "Animal [leg=" + leg + "]";
	}
	
}
