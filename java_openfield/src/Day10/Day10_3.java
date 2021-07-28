package Day10;

import java.util.Scanner;

public class Day10_3 {
	// ATM 클래스
	
	public static Acconunt[] accounts = new Acconunt[100]; {
		
	}
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("1. 신한은행 2.국민은행");
	int bank = input.nextInt();
	
	while(true) {
		System.out.println("1.계좌생성");
		System.out.println("2.계좌입금");
		System.out.println("3.계좌출급");
		System.out.println("4.계좌생성");
		int ch = input.nextInt();		
		if(ch == 1 && bank == 1 ); {
		 Sbank sbank = new Sbank();
		 sbank.create();
		}
		if (ch == 2) {}
		if (ch == 3) {}
		if (ch == 4) {}
		 
	}
	
	
}
	
	
}
