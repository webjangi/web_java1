package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		// 0. 입력객체 선언
		Scanner 입력객체 = new Scanner(System.in);
		
		//1. 변수에 입력값 저장
		
		System.out.println("기본급 입력 : "); int 기본급 = 입력객체.nextInt();
		System.out.println("수당 입력"); int 수당 = 입력객체.nextInt();
		
		//2. 변수 계산
		
		int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);	
		System.out.println("실 수령액 : " +실수령액 );		
		
		
		//3. 십만원구너 세기
		// 금액 : 356789
		
		System.out.println("금액입력 :"); int 금액 = 입력객체.nextInt();	
		System.out.println("십만원권 :" + (금액/100000)+"장");
		//십만원권 빼기
		금액 -= (금액/100000)*100000;
		System.out.println("만원권 : " + (금액)/10000+"장");
		//만원권 빼기
		금액 -= (금액/10000)*10000;
		System.out.println("천원권 : " + (금액/1000)+"장");
		금액 -=(금액/1000)*1000;
		System.out.println("백원권 : " +(금액/100)+"개");
		
		
		
		
		
		
	}

}
