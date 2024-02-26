package sec3;
	
public class Account {
	private int accId;
	private String bankName;
	private String accNume;
	private String accHolder;
	private int balance;
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNume() {
		return accNume;
	}
	public void setAccNume(String accNume) {
		this.accNume = accNume;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", bankName=" + bankName + ", accNume=" + accNume + ", accHolder="
				+ accHolder + ", balance=" + balance + "]";
	}
	
	
	
}
