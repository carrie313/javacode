package exam6;

public class Account {
//	필드
	private String ano;
	private String owner;
	private int balance;
	public Account(String ano, String owner, int balance) {
	
//		super();//자동으로 불러들임. 없어도 작동
//		생성자 자동 생성!
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
//	get set 자동생성
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
