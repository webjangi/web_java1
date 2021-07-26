package Day08;

import java.util.Scanner;

public class board {
	// 게시판 클래스
	
	//1.필드
		//1.번호
		int number;		
		//2.제목
		String subject;		
		//3.내용
		String content;
		//4.작성자
		String name;
		//5.작성일
		String day;		
		//6.조회수
		String hit;
	
	//2. 생성자
		//1.빈생성자
		public board() {	
		}
		
		// 모든 필드를 받는 생성자
		public board(int number, String subject, String content, String name, String day, String hit) {
		
			this.number = number;
			this.subject = subject;
			this.content = content;
			this.name = name;
			this.day = day;
			this.hit = hit;
		}		
		//3. 기타 등등
	
	//3. 메소드
		//1. 글쓰기
		public void bo_write() {
			Scanner input = new Scanner(System.in);
		 System.out.println("[[글쓰기 페이지]]");
		 System.out.println("글제목 : "); String subject = input.next();
		 System.out.println("글내용 : "); String content = input.next();
		 System.out.println("작성자 : "); String name = input.next();
		 
		 //1. 객체 생성
		 
		 board board = new board(number, subject, content, name, hit);
		 //2. 여러개 객체 저장할 메모리 ?? (주기업 장치) [배열, 리스트 등]
		 
		 
		 Day08_2_Start.list[0] = board;
		 //3. 프로그램 종료시 저장되는 메모리(보조기업잧이) [파일처리, datebase등]
		 
		 
		}		


		//2. 글목록
		public void bo_list() {
			 System.out.println("[[글목록 페이지]]");
		}		
		//3. 글수정
		public void bo_update() {
			 System.out.println("[[글수정 페이지]]");
		}		
		//4. 글삭제
		public void bo_delete() {}
		//5. 조회수증가
		public void bo_hit() {
			 System.out.println("[[조회수증가 페이지]]");
		}		
		//6. 글 상세페이지
		public void bo_view() {
			 System.out.println("[[상세페이지 페이지]]");
		}	 
	
	

}
