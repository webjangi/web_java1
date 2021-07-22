package Day06;

import java.util.Scanner;


public class Day06_2 {
	
public static void main(String[] args) {
	int[] 정수배열1 = new int[3]; // int형 3개를 저장할 수 있는 메모리 할당받은 배열
	
	정수배열1[0] =3;
	정수배열1[0] =4;
	정수배열1[0] =5;
	
	// 배열선언2 : 선언과 동시에 초기값 
	String[] 문자열배열2 = {"유재석", "강호동", "신동엽"};
	  //stringt 클래스 객체 3개를 저장하는 메모리 할당받은 배열
	
	 Scanner scanner = new Scanner(System.in);
	 
	while(true) {//무한루프 [종료조건 : 4번 눌렀을때 break;]
	
		System.out.println("1. 학생수 2.점수입력 3.분석 4. 종료");
		System.out.println("선택 :"); int ch = scanner.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("학생수 입력:");break;
		case 2:
		 System.out.println("점수 입력 :");break;
		case 3:
			System.out.println("점수 입력 :");break;
		case 4:
			System.out.println("[[종료]]");break;
		
		}
		
	}
	

	
	
	
	
	
}
	
	
}
