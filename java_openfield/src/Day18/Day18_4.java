package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18_4 {
	
	
	public static Queue<Subway> 종점역 = new LinkedList<>();
	public static Queue<Subway> 용산역 = new LinkedList<>();
	public static Queue<Subway> 서울역 = new LinkedList<>();
	public static Queue<Subway> 구로역 = new LinkedList<>();
	public static ArrayList<Queue<Subway>> 전철현황 = new ArrayList<>();
	
	//메인 메소드 
	public static void main(String[] args) {
		
		Queue<Subway> 종점역 = new LinkedList<>();
		Queue<Subway> 용산역 = new LinkedList<>();
		Queue<Subway> 서울역 = new LinkedList<>();
		Queue<Subway> 구로역 = new LinkedList<>();
		종점역.offer(new Subway("A-1"));
		종점역.offer(new Subway("A-2"));
		종점역.offer(new Subway("A-3"));
		
	
		 전철현황.add(종점역);
		 전철현황.add(용산역);
		 전철현황.add(서울역);
		 전철현황.add(구로역);
		 
		 Scanner scanner = new Scanner(System.in);
		 while (true) {
			 전철역현황();
			 System.out.println("출발신호 : 0.종점 1.용산 2.서울 3.구로");
			 int ch = scanner.nextInt();
			 if(ch==0) {출발신호(ch);}
			 if(ch==1) {출발신호(ch);}
			 if(ch==2) {출발신호(ch);}
			 if(ch==3) {출발신호(ch);}
			 
		}// while		
	}//main 끝
	
	// 전철 출발 신호 [메소드화 : 역번호에 따른 전철 출발 코드 ]
	public static void 출발신호(int 역번호) {
		
		if( 전철현황.get(역번호).isEmpty()) {
			
			System.out.println("현재 대기중인 전철이 없습니다 ");
			return;
		}
		
		
	Subway temp = 전철현황.get(역번호).poll();
	System.out.println("[[출발 : " +temp.전철번호);
	System.out.println("[[소요시간 : 2초 " );
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {	
	}
	
	
	전철현황.get(역번호+1).offer(temp);
		System.out.println("도착 : " +temp.전철번호);
	}

	//전철 현황 메소드
	public static void 전철역현황() {
		 System.out.println("현재 종점영 전철 환황 :" + 전철현황.get(0));
		 System.out.println("현재 용산역 전철 환황 :" + 전철현황.get(1));
		 System.out.println("현재 서울역 전철 환황 :" + 전철현황.get(2));
		 System.out.println("현재 구로역의 전철 환황 :" + 전철현황.get(3));
	}
	
	
	
	
	
}
