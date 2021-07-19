package Day04;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class Day04_2 {
	
	public static void main(String[] args) {
		

		
			Scanner scanner = new Scanner(System.in);
			//제품들의 변수들		
			int 콜라재고 = 10; int 환타재고 =10; int 사이다재고 =10; //재고변수
			int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 =0; // 구매수 변수
			int 총결제액 = 0;	
			
			
			while(true) {						
				System.out.println("\n[[자판기]]");
				System.out.println("[[1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
				System.out.println("[[선택]]"); int 선택 = scanner.nextInt();
				if (선택 == 1) {
					System.out.println("[[[콜라을 담았습니다.]]");
					//1. 재고가 없을 경우 구매 불가.
					if(콜라재고 > 0) { //재고가 있을 경우
						콜라구매수++; //콜라구매수 증가
						콜라재고--; //콜라재고 감소
					}else {
						System.out.println("[[콜라 재고가 없습니다.]");
						}
				}
				if (선택 == 2) {}
				if (선택 == 3) {}
				if (선택 == 4) {				
				System.out.println("[[[장바구니]]]");
				System.out.println("콜라 구매수 :" + 콜라구매수 + "결제액 : " +콜라구매수*300);
				총결제액 = (콜라구매수*300);
				System.out.println("결제하시겠습니까? 예[1] 아니요[0]");int 선택2 = scanner.nextInt();
				if(선택2 == 1) {
					
					
				}
				
				}
									
				
			}// 무한루프 종료 지점
			
  }//main
	
}
