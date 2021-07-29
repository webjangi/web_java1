package Day11;

public interface ATM {
	
		//추상메소드
		public void menu(); //메뉴
		public void create(); // 계좌등록
		public void deposit(); // 출금
		public void withdraw(); // 출금
		public void transfer(); //이체
		public void balance();  //잔금
		
		public default void 종료() {
			System.out.println("은행 종료");		
			
		}
		

}
