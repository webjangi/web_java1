package Day11;

import java.util.Scanner;

public class Day11_3 {
	
	public static void main(String[] args) {
		
		//인터페이스 선언		
		ATM atm;
		
		//2. 연결
		atm = new 은행();
		
		while (true) {			
			Scanner input = new Scanner(System.in);			
			System.out.println("1.신한 2.국민");
			
			int ch = input.nextInt();
			
			if(ch==1) {
				atm= new 신한은행();
				// 슈퍼클래스에 연결된 인터페이스는 서브클래스에서도 사용 가능
				atm.menu();
			}		
			
			
		}//while end
		
		
		
	}

}
