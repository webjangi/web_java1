package Day12;

import java.util.Scanner;

public class Day12_1 {	
	
	// 예외처리 : 예외[오류] 발생했했을 경우 처리 코드
		// 목적 : 예외가 발생했을 때 프로그램 종료 방지 [프로그램 정상화]
		// 코드상 오류는 컴파일러 [실행] X
		// 코드상 문제는 없지만 실행된 후에 프로그램 실행시 예외
		// 오류 처리방법 
			//1. IF : 이미 알고 있는 예외일 경우
			//2. tr~catch : 다양한 경우의 예외일 경우 
		//형태
			//try { 예외가 발생할것같은 코드 }catch(예외클래스 객체명){ 예외대체코드 }
	public static void main(String[] args) {
		
		// 1. 객체가 null 인경우 출력
		try {
			//예외가 발생하면 catch 이동 // 아니면 그대로 실행
			String 문자열 = null;
			System.out.println(문자열);
			System.out.println(문자열.toString()); 
		}
		catch ( NullPointerException exception) {
				// 예외클래스명 객체명(임의)
			System.out.println("오류발생 : 사유 "+ exception);
			System.out.println("[[관리자에게 문의]] ");
			
		}
		
		
		//2. 배열에 index가 부족한 경우
		
		try {
	String[] 문자열 = new String[2];		
		문자열[0] = "강호동";
		문자열[1] = "유재석";
		문자열[2] = "신동엽";
	}
	catch (ArrayIndexOutOfBoundsException exception) {
		System.out.println("오류발생 :" + exception);
		System.out.println("[[더이상 인원을 추가할 수 없습니다.]]");
		
	}
	
		//3. 숫자 => 문자 변경가능	
		try {
			String  문자열2 = "100";
			String  문자열3 = "김100";
			
			System.out.println(Integer.parseInt(문자열2));
						// Integer.parseInt(문자열2) : 문자열 => 정수
			System.out.println(Integer.parseInt(문자열3));
		}
		catch(NumberFormatException exception) {
			System.out.println("오류발생 :" + exception);
		}
		
		
		//4. 예외클래스를 모를 경우
		
		try {
		String 문자열 = null;
		System.out.println(문자열);
		//System.out.println(문자열.toString()); 
			
		String[] 문자열배열 = new String[2];		
		문자열배열[0] = "강호동";
		문자열배열[1] = "유재석";
		문자열배열[2] = "신동엽";
		
		String  문자열배열2 = "100";
		String  문자열배열3 = "김100";
		
		System.out.println(Integer.parseInt(문자열배열2));	
		System.out.println(Integer.parseInt(문자열배열3));
		
		}catch(Exception exception) {
			System.out.println("예외발생 :" + exception);
		}finally {
			System.out.println("무조건 실행되는 finally 코드" );
		}
		
		
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		
			try {
			System.out.println("문자입력 받기 ");
			int 숫자 = scanner.nextInt();
			}catch (Exception exception ) {
				System.out.println("오류발생 : " + exception );
			}
		
			
		}
		
		
		
		
	}	
}
