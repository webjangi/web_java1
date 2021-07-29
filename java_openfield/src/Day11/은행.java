package Day11;
//인터페이스
public class 은행 implements ATM{
	
	//필드ac
	private String account;
	private int money;
	
	//생성자 
	
	@Override
	public void balance() {
		System.out.println( "잔금 페이지 ");
		
	}
	@Override
	public void deposit() {
		System.out.println( "출금 페이지 ");
		
	}
	@Override
	public void menu() {
		System.out.println( "메뉴 페이지 ");
	}
	@Override
	public void transfer() {
		System.out.println( "잔고 페이지 ");
		
	}
	@Override
	public void withdraw() {
		System.out.println( "잔고 페이지 ");
		
	}
	
	
	
	public 은행() {
		// TODO Auto-generated constructor stub
	}

	public 은행(String account, int money) {
		super();
		this.account = account;
		this.money = money;
	}
	
	
	
	//메소드
	public void create() {
		
	}
	

}
