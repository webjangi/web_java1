package Day10;

// �̸� ����� ���� Ŭ������ ���� ��ӹ޾Ƽ� ���踦 �ϴ� �� ���� Ŭ����
public class Sbank extends Acconunt  {
	
	private final String bankcode ="101"; // ����ĺ��� �ڵ�
	
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