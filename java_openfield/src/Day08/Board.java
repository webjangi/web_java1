package Day08;

import java.util.Date;
import java.util.Scanner;

public class Board {
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
		int hit;
	
	//2. 생성자
		// [ 생성자명 == 클래스명 동일]
		//1.빈생성자 [ ctrl+스페이바 
		public Board() {	
		}
		
		// 모든 필드를 받는 생성자
		public Board(int number, String subject, String content, String name, String day, int hit) {
		
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
		 int number = 1; // 인덱스 -1 없음
		 	// 게시물번호 [1. 자동[db] 2. 수동]
		 	for(int i=0; i<Day08_2_Start.list.length; i++) {
		 		if(Day08_2_Start.list[i] == null ) {
		 			
		 			//1.첫번째 게시물인 경우 1부터 시작
		 			if(i == 0) {
		 				number = 1; break;
		 			}
		 			else {
			 			number = Day08_2_Start.list[i-1].number + 1; break;
			 			
			 		}	
		 		}
		 	}
		 Date date = new Date(); //오늘날짜/시간 클래스
		 String day = date.toString(); //날짜객체의 정보
		 int hit = 1; //  게시물 작성시 조회수 1부터 시작
		 	
		 Board board = new Board(number, subject, content, name, day, hit);
		
		 //2. 여러개 객체 저장할 메모리 ?? (주기업 장치) [배열, 리스트 등]
		 for(int i=0; i<Day08_2_Start.list.length; i++) {
			 if(Day08_2_Start.list[i]==null) {
				 Day08_2_Start.list[i]= board;
				 break;
			 }
		 }
		 
		 
		// Day08_2_Start.list[0] = board;
		 //3. 프로그램 종료시 저장되는 메모리(보조기업잧이) [파일처리, datebase등]
		 
		 
		}		


		//2. 글목록
		public void bo_list() {
			 System.out.println("[[글목록 페이지]]");
			 System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
			 
			 for(int i=0; i<Day08_2_Start.list.length; i++) {				 
				 if(Day08_2_Start.list[i] == null) return;
				 System.out.print(Day08_2_Start.list[i].number + "\t");
				 System.out.print(Day08_2_Start.list[i].subject + "\t");
				 System.out.print(Day08_2_Start.list[i].name + "\t");
				 System.out.print(Day08_2_Start.list[i].hit + "\t");
				 System.out.print(Day08_2_Start.list[i].day + "\t");
				 System.out.println();
			 }
		}		
		//3. 글수정
		public void bo_update(int number) {
			Scanner input = new Scanner(System.in);
			 System.out.println("[[글수정 페이지]]");
			
			int index = findboard(number);
			if(index== -1)return;		
			System.out.print("제목 :");
			Day08_2_Start.list[index].subject = input.nextLine();
			System.out.print("내용 :");
			Day08_2_Start.list[index].subject = input.nextLine();
			System.out.println("수정완료");
			
		}		
		//4. 글삭제
		public void bo_delete(int number) {
			System.out.println("[[글삭제 페이지]]");
			System.out.println("[[ 해당 게시물이 삭제 되었습니다. ]]");
			
			int index = findboard(number);
			if(index == -1) return;
			
			// 해당 게시물번호의 객체 삭제 
			Day08_2_Start.list[index] = null;
			//삭제된 게시물 뒤로 당기기
			for(int j= index; j<Day08_2_Start.list.length; j++) {
				
				//다음 객체가 있으면
				if(Day08_2_Start.list[j+1] != null) {
				   Day08_2_Start.list[j] = Day08_2_Start.list[j+1];
				}else {
					Day08_2_Start.list[j] = null;	
					break;
				}	
			}			
			
		}
		
		//5. 조회수증가
		public void bo_hit() {
			// System.out.println("[[조회수증가 페이지]]");
			 this.hit++;
		}		
		//6. 글 상세페이지
		public void bo_view(int number) { //인수
			
			
				//게시물 찾기 메소드 호출
			int index = findboard(number);
			if(index == -1) return; // 만약에 -1이면 현재 메소드 종료
			
			Board board = Day08_2_Start.list[index];			
		    board.bo_hit(); // 조회수 증가 메소드 호출
				
			
			if(board == null) return;
			
			 System.out.println("[[상세페이지 페이지]]");
			 System.out.println("제목 :" + board.subject);
			 System.out.println("작성자 :"+board.name + "   조회수 :"+board.hit+ "   작성일 :"+board.day);
			 System.out.println("내용 :");
			 System.out.println("1.수정 2.삭제 3.댓글작성 4.뒤로가기");
			 Scanner input = new Scanner(System.in);			 
			 int ch = input.nextInt();
			 if (ch == 1) {}
			 if (ch == 2)  { bo_delete(number); return;}
			 if (ch == 3) {}
			 if (ch == 4) {
				 return; // 메소드 종료
			 }			 
		}	 
	
		//7. 게시물번호의 해당하는 배열의 위치를 찾는 메소드.
		public int findboard (int number) {
			
			for(int i=0; i<Day08_2_Start.list.length; i++) {				
				 if(Day08_2_Start.list[i] != null && Day08_2_Start.list[i].number == number ) {					 
					 return i; // 찾은 게시물을 배열위치를 반환				
				 }				
			}
			
			System.out.println("[[오류]] 해당 게시물 번호가 없습니다.");
			return -1; // 배열의 시작은 0부터 -1
		}
		// 반환타입 : 찾은 배열의 위치 반환

}
