package s0522;

public class Account {

	private String name;
	private int no;
	private int balance;

	public Account() {

	}

	public Account(String name, int no) {
		this.name = name;
		this.no = no;

	}

	public Account(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;

	}

	String getName() {
		return name;
	}

	int getNo() {
		return no;
	}

	int getBlance() {
		return balance;
	}

	void setName(String name) {
		this.name = name;
	}

	void setNo(int no) {
		this.no = no;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	void printInfo() {
		System.out.println("[계좌정보] 예금주:" + name + "계좌번호:" + no + "현재잔고:" + balance);

	}

	void deposit(int money) {
		balance += money;
		System.out.println(name + "님" + money + "원 입금");

	}

	void withdraw(int money) {
		if (balance<money){
			System.out.println(name+"님"+money+"원 출금 실패-현재 잔액:"+balance+"원");
			
		}
		else {
			balance-=money;
			System.out.println(name+"님"+money+"원 출금");
			
		}
		
		
		
		
	}

}
