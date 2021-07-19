package Day04;

import java.util.Scanner;

import java.util.Scanner;

public class Day04_2 {
	
	public static void main(String[] args) {
		

		
			Scanner scanner = new Scanner(System.in);
			//제품들의 변수들		
			int 콜라재고 = 2; int 환타재고 =2; int 사이다재고 =5; //재고변수
			
			while (true) {
			int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 =0; // 구매수 변수
			int 총결제액 = 0;				
			
			while(true) {	//사람마다 무한 루프 					
				System.out.println("\n[[자판기]]");
				if(콜라재고 == 0) System.out.print("[[1.콜라[품절]");
				else System.out.print("[[1.콜라[300원]");
				
				if(환타재고 == 0) System.out.print("[[2.환타[품절]");
				else System.out.print("[[2.환타[200원]");
				
				if(사이다재고 == 0) System.out.print("[[3.사이다[품절]");
				else System.out.print("[[3.사이다[100원]");
				
				
				System.out.println("[[선택 :"); int 선택 = scanner.nextInt();
				if (선택 == 1) {
					//1. 콜라재고가 없을 경우
					if(콜라재고 > 0 ) {
						System.out.println("[[[콜라을 담았습니다.]]");
						콜라구매수++; //구매수 증가
						콜라재고--; //재고 감소
					}else {
						System.out.println("[[콜라 재고가 없습니다.]");
						}
							
					
				}
				if (선택 == 2) {
					if(환타재고 > 0 ) {
						System.out.println("[[[환타를 담았습니다.]]");
						환타구매수++; //구매수 증가
						환타재고--; //재고 감소
					}else {
						System.out.println("[[환타 재고가 없습니다.]");
						}
					
				}
				if (선택 == 3) {
					if(사이다재고 > 0 ) {
						System.out.println("[[[사이다를 담았습니다.]]");
						사이다구매수++; //구매수 증가
						사이다재고--; //재고 감소
					}else {
						System.out.println("[[사이다 재고가 없습니다.]");
						}
					
				}
				if (선택 == 4) {				
				System.out.println("[[[장바구니]]]");
				System.out.println("콜라 구매수 :" + 콜라구매수 + "결제액 : " +콜라구매수*300);
				총결제액 = (콜라구매수*300);
				System.out.println("결제하시겠습니까? 예[1] 아니요[0]"); int 선택2 = scanner.nextInt();
					if(선택2 == 1) {
						System.out.println("금액투여:"); int 금액 = scanner.nextInt();					
						if(금액 < 총결제액) {
							System.out.println("금액 부족(초기화면)");
							콜라재고+=콜라구매수;		
							break;
						}else {
						금액 -= 총결제액;
						System.out.println("[[결제완료]] : 잔돈 : " +금액 );
						System.out.println("\n[결제완료] 이용해주셔서 감사합니ㅏ다");
						break;
					  	}
					}
						if(선택2 == 0) {
							System.out.println("[[초기화면으로 이동]]");
							콜라재고+=콜라구매수;
							break;
							}
						
						break;			
					
				
				}
									
				
			}// 두번째 무한루프 종료 지점
			}// 첫뻔째 무한 루프 종료 지점
  }//main
	
}