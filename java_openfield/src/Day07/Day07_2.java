package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_2 {

	public static void main(String[] args) {
		
		//0.설정
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); //난수[랜덤] 생성 객체
		//1. 배열선억
		int[] 번호 = new int[6];
		int[] 추첨번호 = new int[6];
	
		
		//2. 입력받기
		for(int i=0; i<6; i++){
			System.out.println("1~45 수 입력 : "); int 선택 = scanner.nextInt();
			// 1. 1~45 사이인지 체크
			if(선택<=0 || 선택>45) {
				System.out.println("[[경고]] : 1~45사이에만 입력 [[다시 입력]]");
				i--;//정상적인 입력아니기 때문에 i를 차감
			}else {	
			// 2. 이미 배열에 존재하는 제크
				boolean 중복체크 = true;
				for(int temp : 번호) {
					//for (임시변수 : 배열 ) => 배열내 모든 요소를 하나씩 변수 대입
					if(temp==선택) {
						System.out.println("[[경고]]이미 선택한 번호 입니다.[다시입력]");
						i--;
						중복체크 = false;
						break;
					}
				}
			    if(중복체크)번호[i] = 선택; 
			
			}						
		}// for end
		//2-1 입력rkqt 확인
		System.out.print("\n 선택하신 번호는 :");
		for (int temp:번호) {
			System.out.print(temp+" ");
		}//for end
		
		
		//3. 추첨번호 생성
		for(int i =0; i<6; i++) {
			//1. 난수 생성
			int 추첨 = random.nextInt(45)+1; //0~44 +1 ==> 1~45				   
			//2. 중복 제어
			boolean 중복체크 = true;
			for(int temp: 추첨번호) {
				if(temp == 추첨) {
					i--; 
					중복체크 = false;
					break;
				}
				
			}//for end
			if(중복체크) 추첨번호[i] = 추첨;
		}
		
		//3-1 난수값 확인
		System.out.print("\n 추첨결과 번호는:");
		for(int temp : 추첨번호) {
			System.out.print(temp+" ");
		}
					
		//4. 추첨결과 [두 배열과 비교]
		int 당첨개수 =0;
		for (int temp: 번호) {
			
			for(int temp2:추첨번호) {
				if(temp == temp2) 당첨개수++;
			}			
		}
		System.out.println("\n 당첨개수 :" +당첨개수);
		
		
		
		
		
	}
	
	
}
