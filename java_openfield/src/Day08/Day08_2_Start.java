package Day08;

import java.util.Scanner;

public class Day08_2_Start {

	public static Scanner input = new Scanner(System.in);
	
	public static board[] list= new board[100];
	
	
	public static void main(String[] args) {
		
		//2. 메소드 호출 
	   start(); //main 메소드가 start 메소드를 못읿음 [static]
		
	}//main end

		//1. 메소드 선언
		//프로그램 실행 메소스
	public static void start() {
		
		board board = new board(); // 필드가 null인 깡통 객체
		
		while(true) {		
			 board.bo_list(); //1. 글목록
			 System.out.println("0.글쓰기 1.글상세보기 ");
			 int ch = input.nextInt();
			 if(ch==0) board.bo_write(); //글쓰기
			 if(ch==1) {
				 int ch2 = input.nextInt();
				 board.bo_view(ch2); // 글 상세이미지
			 }
		}
		
	}
	
	
}// class end
