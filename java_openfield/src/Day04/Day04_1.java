package Day04;

import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
				System.out.println("정수1 : "); int 정수1 = scanner.nextInt();
				System.out.println("정수2 : "); int 정수2 = scanner.nextInt();
				System.out.println("정수3 : "); int 정수3 = scanner.nextInt();
				System.out.println("정수4 : "); int 정수4 = scanner.nextInt();
				
				//스왑 = 교환
				int temp;
				
				//  정렬
				 // 1. 첫번째 변수와 다른 변수와 비교 = 3번								
				if( 정수1 > 정수2) {temp = 정수1; 정수1=정수2; 정수2=temp;}
				if( 정수1 > 정수3) {temp = 정수1; 정수1=정수3; 정수3=temp;}
				if( 정수1 > 정수4) {temp = 정수1; 정수1=정수4; 정수4=temp;}
				
				 // 2. 두번째 변수와 다른 변수와 비교 = 2번				
				if( 정수2 > 정수3) {temp = 정수2; 정수2=정수3; 정수3=temp;}
				if( 정수2 > 정수4) {temp = 정수2; 정수2=정수4; 정수4=temp;}
				 
				// 3. 두번세 변수와 다른 변수와 비교 = 2번				
				if( 정수3 > 정수4) {temp = 정수3; 정수3=정수4; 정수4=temp;}
				
				System.out.println("오름차순 : " + 정수1 + 정수2 + 정수3+ 정수4);
		*/
		 System.out.println("[[[ 로그인 페이지 ]]]");
		 System.out.println("아이디 :" );  String id = scanner.next();
		 System.out.println("비밀번호 :"); int password = scanner.nextInt();
		 //로그인 처리 
		 
		 if (id.equals("admin")) { //문자열 [클래스]
			// String 클래스 비교 메소드 : 문자열.equals("비교대상") =>결과: true / false
			//아이디가 동일한 경우
			 if(password == 1234 ) System.out.println("[성공] 로그인 성공");		
				 //비밀번호가 동일한경우				
			 else System.out.println("[실패] 비밀번호 정보가 다릅니다.");				 
			 
		 }else System.out.println("[실패]아이디 정보가 없습니다." );	 
		
	
	}
}
