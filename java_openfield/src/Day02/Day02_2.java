package Day02;

import java.util.Scanner;
  // improt : 다른 파일에 있는 라이브러리를 가져오다 [클래스]
  // import 패키지명. 클래스

public class Day02_2 {
	
	// 입력받기
	
	public static void main(String[] args) {
		
		//1. Scanner 클래스 : 입력관련 클래스
		Scanner 입력객체 = new Scanner(System.in);
		// 1.  Scanner : 입력관련된 메소드 제공
		
		 System.out.println("정수 입력 : ");
		// 1. 변수 생성
		 int 입력정수 ;
		 // 2. 변수 입력값 저장
		 입력정수 = 입력객체.nextInt(); // 입력객체에서 청수형 빼오기
		 // 3. 변수 출력
		 System.out.println("현재 입력한 정수는 : " + 입력정수);
		 
		 System.out.println("문자열 입력 :");
		  // 1. 문자열객체 생성
		 
		  String 문자열 = 입력객체.next(); // 입력객체에서 문자열 빼오기
		  System.out.println("현재 입력한 문자열은 :" + 문자열);
		  입력객체.nextLine(); //문제점 보안
		  System.out.println("공백포함 입력:");
		  String 문자열2 = 입력객체.nextLine();
		  System.out.println("현재 입력한 문자열은 : " +문자열2);
		  
		  
		  
	}

}
