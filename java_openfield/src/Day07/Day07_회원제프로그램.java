package Day07;

import java.util.Scanner;

public class Day07_회원제프로그램 {
	
	// 회원제 프로그램 
			// 회원가입 · 로그인 
				// [조건1] 2차원배열 
				// [조건2] 최대 회원 100명 제한
					// 1.아이디 , 비밀번호 배열에 저장 
				// [조건3] 무한루프 [ 초기 메뉴 ]
					// 1. 회원가입 [중복아이디x]
					// 2. 로그인 
					// 3. 종료 
				// [조건4] 로그인시 메뉴 
					// 1.회원탈퇴 2.패스워드변경 3.로그아웃[초기메뉴]
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//1. 2차원배열 [회원100명 아이디, 비밀번호]
				//100개 행[회원100명] 2개 열 [아이디, 비밀번호]
			String[][] memberlist = new String[100][2];
			
			//3. 프로그램 실행 반복문
			while(true) {//무한 루프 [종료조건:3번 입력시 break 
				
				System.out.println("\n[[회원제 프로그램]]");
				System.out.print("[[1.회원가입 2.로그인 3종료 4선택 :");
				int ch = input.nextInt();
				
				if(ch==1) {//회원가입
					
					System.out.println("[[회원가입 페이지]]");
					System.out.println("--> 아이디 :"); String id = input.next();
					System.out.println("--> 패스워드 :"); String password = input.next();
					
					//중복체크
					boolean idchek = true;
					for(int i=0; i<memberlist.length; i++) {
						if(memberlist[i][0] != null && memberlist[i][0].equals(id))	{
					//기존 회원에 아이디가 null 아니면서 아이디가 앞전에 입력한 아이디와 동일하면
						System.out.println("[[실피]] 중복된 아이가 존재합니다. ");
						idchek = false;
						break;	
						}
					}
					if(idchek) {
						for(int i=0; i<memberlist.length; i++) {
							if(memberlist[i][0] != null) {
								memberlist[i][0] = id;
								memberlist[i][1] = password;
								System.out.println("[[완료]] : 회원가입이 완료되었습니다. ");
								break;
							}
							
						}
						
					}
					
				}//회원가입 end
				else if(ch==2) {//로그인
					System.out.println("[[로그인 페이지]]");
					System.out.println("-->아이디 :"); String id = input.next();
					System.out.println("-->비밀번호 :"); String password = input.next();
				
					boolean loginchek = true;
					
				}
				
				
			
			}//while end
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		 
}
