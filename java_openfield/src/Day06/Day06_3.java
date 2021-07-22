package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {
	
	public static void main(String[] args) {
		
	Scanner scaner = new Scanner(System.in);	
	Random random = new Random(); // 랜덤 클래스를 이용한 랜덤 객체
	
	//1. 게임팜 정의		
	String[] 게임판 = {"[ ]", "[ ]","[ ]",
			           "[ ]","[ ]","[ ]", 
			           "[ ]","[ ]","[ ]"};
	
	
		while(true) {
			for (int i = 0; i<게임판.length; i++) {
				System.out.print(게임판[i]);
				if (i%3 == 2) System.out.println();
			}
				
			//3. 플레이어에게 위치 선택받아 알 두기
			System.out.println("위치선택 : "); int index =scaner.nextInt();
			//1. 이미 알이 존재하는 경우 다시 입력받기
				if( 게임판[index].equals("[ ]")) { 게임판[index] = "[0]"; break;}
				  //string 클래스는 == 같다 연산자 사용불가 [.equals]
				else {
					System.out.println("[[경]] 이미 둔 자리 입니다.[다시입력]");
					
				 }				
				}
		//4. 컴퓨터가 난수생성에서 알두가ㅣ
	int rindex = random.nextInt(9);
	System.out.println(random.nextInt());	
		
		
		}//while;

}
