package Day10;

import java.util.Scanner;

// ����Ŭ���� ���Ǵ� ���� Ŭ����
public class Acconunt {
	//Ŭ���� ù���ڴ� �빮�ڷ� ����� 
	
	
	//�ʵ� 
	 private String account_number;
	 private String account_password;
	 private int acconut_money;
	
	 
	 //������
	 public Acconunt() {
		
	}
	 public Acconunt(String account_number, String account_password, int acconut_money) {
		super();
		this.account_number = account_number;
		this.account_password = account_password;
		this.acconut_money = acconut_money;
	}
	
	
	//�޼ҵ�
	// 1. ���»���
	public void create() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("[[[���� ���� ]]]");
		System.out.println("[[���¹�ȣ : " );  String number = input.next();
		System.out.println("[[��й�ȣ : " ); String password = input.next();
		System.out.println("[[�ʱ⿹�ݾ� : " ); int money = input.nextInt();
		
		//��üȭ
		Acconunt acaccount = new Acconunt(number, password, money);
		
		//�迭
		for(int i = 0; i<Day10_3.accounts.length; i++) {
			if(Day10_3.accounts[i] == null){
				Day10_3.accounts[i] = account;
				System.out.println("[[���� ���� �Ϸ�]]");
				return;
			}
			
		}
		
		System.out.println("[[���� ���� �Ұ�]]");
				
	}
	// 2. �Ա�
	public void deposit() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("[[���¹�ȣ : " );  String number = input.next();	
		System.out.println("[[���ݾ� : " ); int money = input.nextInt();
		
		int result = findeaccount(number);
		if(result == -1) return;
		
		Day10_3.accounts[result].acconut_money += money;
		System.out.println("[[���ݿϷ� : ������ �ݾ� : " + 
		Day10_3.accounts[result].acconut_money +"]]");
		
	}
	// 3. ���
	public void withdraw() {
		
	}
	// 4. ��ü
	public void transfer() {
		
	}
	
	
	// 5. ����ã��
	public int findeaccount( String number ) {
		//�޼ҵ�
		//1. ��ȯŸ�� : int => �޼ҵ� ����Ǹ鼭 int�� ������ return
		//2. �μ� : string => �޼ҵ尡 ���۵Ǹ鼭 �޼ҵ�� ������ ������  [���¸� ã������ �˻� ���]
		for(int i =0; i<Day10_3.accounts.length; i++) {
			if(Day10_3.accounts[i] !=null && Day10_3.accounts[i].account_number.equals(number)) {
				
				return i ;	
			}
		}		
		return -1;
	}
	
	
		
	public String getAccount_number() {
		return account_number;
	}
	
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_password() {
		return account_password;
	}
	
	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}
	
	public int getAcconut_money() {
		return acconut_money;
	}
	
	public void setAcconut_money(int acconut_money) {
		this.acconut_money = acconut_money;
	}
	 
	 
	 	
	
	
	

}