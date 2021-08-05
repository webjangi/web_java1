package Day16;

import java.util.Scanner;

public class Day16_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		while (true) {
			
			System.out.println("[[명당 관리 ]]");
			System.out.println("1. 명단등록 2. 명단출력");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("이름 : "); String name = scanner.next();
				System.out.println("나이 : "); int age = scanner.nextInt();
			}
			
		}//while 
		
		
	}//main
	

}
