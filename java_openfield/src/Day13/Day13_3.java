package Day13;

import java.io.IOException;

public class Day13_3 {
		
	public static void main(String[] args) throws IOException  {
	
		String[] 도서목록 = {
				"된다! 네이버 블로그&포스트", 
				"스프링 부트 실전 활용 마스터", 
				"Tucker의 Go 언어 프로그래밍", 
				"혼자 공부하는 C언어"};
		
		byte[] 바이트배열 = new byte[100];
		System.out.print("검색할 도서명 : ");	
			System.in.read(바이트배열);
			String 검색어 = new String(바이트배열);
		
		// 검색에 해당하는 도서 출력
		for(int i=0; i<도서목록.length; i++) {					
			if(도서목록[i].indexOf(검색어) != -1) {
				 System.out.println(도서목록[i]);
			}			
		}
		
		// 교체
		System.out.println("교체 단어 :");
		System.in.read(바이트배열);
		String 교체단어 = new String(바이트배열);		
		System.out.println("새로운 단어 :");
		System.in.read(바이트배열);
		String 새로운단어 = new String(바이트배열);
		
		for( int i=0; i<도서목록.length; i++) {
			if(도서목록[i].indexOf(검색어) !=-1) {
				도서목록[i].replace(교체단어, 새로운단어);
			}
		}
		
		//검색에 해당 하는 도서 출력
		for(int i=0; i<도서목록.length; i++) {				
			if(도서목록[i].indexOf(검색어) != -1) {
				 System.out.println(도서목록[i]);
			}
			
		}
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		537771
	}
}
