package Day10;

// 미리 설계된 계좌 클래스로 부터 상속받아서 설계를 하는 것 서브 클래스
public class Sbank extends Acconunt  {
	
	private final String bankcode ="101"; // 은행식별용 코드
	
	public Sbank() {
		// TODO Auto-generated constructor stub
	}
	
	public Sbank(String account_number, String account_password, int account_money) {
		super(account_number, account_password,account_money );
	}

	
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		super.create();
	}
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		super.withdraw();
	}
	
	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		super.transfer();
	}
	
	
}
