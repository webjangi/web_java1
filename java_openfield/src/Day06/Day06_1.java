package Day06;

import java.util.Scanner;

public class Day06_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");int 국어 = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");int 영어 = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");int 수학 = scanner.nextInt();
     
		switch(국어) {
		case 90 : System.out.println("90점 입니다 "); break;
		case 80 : System.out.println("80점 입니다 "); break;
		case 70 : System.out.println("70점 입니다 "); break;
		default : System.out.println("탈락 입니다 "); break;
	}
		
		
		int 평균 = (국어+영어+수학/3);
		
		switch(평균/10) {
		case 9: System.out.println("A등급입니다. ");break;
		case 8: System.out.println("B등급입니다. "); break;
		case 7: System.out.println("C등급입니다.  ");break;
		default:System.out.println("탈락입니다. ");
		}
		
	}

	
	
}
