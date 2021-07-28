package Day10;

import java.util.Scanner;

// 슈퍼클래스 사용되는 계좌 클래스
public class Acconunt {
	//클래스 첫글자는 대문자로 만들기 
	
	
	//필드 
	 private String account_number;
	 private String account_password;
	 private int acconut_money;
	
	 
	 //생성자
	 public Acconunt() {
		
	}
	 public Acconunt(String account_number, String account_password, int acconut_money) {
		super();
		this.account_number = account_number;
		this.account_password = account_password;
		this.acconut_money = acconut_money;
	}
	
	
	//메소드
	// 1. 계좌생성
	public void create() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("[[[계좌 생성 ]]]");
		System.out.println("[[계좌번호 : " );  String number = input.next();
		System.out.println("[[비밀번호 : " ); String password = input.next();
		System.out.println("[[초기예금액 : " ); int money = input.nextInt();
		
		//객체화
		Acconunt acaccount = new Acconunt(number, password, money);
		
		//배열
		for(int i = 0; i<Day10_3.accounts.length; i++) {
			if(Day10_3.accounts[i] == null){
				Day10_3.accounts[i] = account;
				System.out.println("[[계좌 생성 완료]]");
				return;
			}
			
		}
		
		System.out.println("[[계좌 생성 불가]]");
				
	}
	// 2. 입금
	public void deposit() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("[[계좌번호 : " );  String number = input.next();	
		System.out.println("[[예금액 : " ); int money = input.nextInt();
		
		int result = findeaccount(number);
		if(result == -1) return;
		
		Day10_3.accounts[result].acconut_money += money;
		System.out.println("[[에금완료 : 예금후 금액 : " + 
		Day10_3.accounts[result].acconut_money +"]]");
		
	}
	// 3. 출금
	public void withdraw() {
		
	}
	// 4. 이체
	public void transfer() {
		
	}
	
	
	// 5. 계좌찾기
	public int findeaccount( String number ) {
		//메소드
		//1. 반환타입 : int => 메소드 종료되면서 int형 데이터 return
		//2. 인수 : string => 메소드가 시작되면서 메소드로 들어오는 데이터  [계좌를 찾기위한 검사 대상]
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
