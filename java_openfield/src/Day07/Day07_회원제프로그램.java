package Day07;

import java.util.Scanner;

public class Day07_회원제프로그램 {
	
	//회원가입 .로그인
	 // [조건1] 2차원배열
	 // [조건2] 최대 회원 100명 제한
	     // 1.아이디, 비밀번호 배열에 저장
 	 // [조건3] 무한루프 [초기메뉴]
	     //1. 회원가입 [중복아이디x]
	     //2. 로그인
	     //3. 종료
	// [조건4' 로그인시 메뉴
	     //1.회원탈퇴 2.패스워드변경 3.로그아웃[초기메뉴]
	
	
	
	 public static void main(String[] args) {
	      // 0. 설정 [코드상 필요한 객체]
		 Scanner scanner = new Scanner(System.in);
		 //1. 2차원배열 [회원100명 아이디 비밀번호]
		  //100개 행 [회원100명] 2개 열 [아이디, 비밀번호]		 
		String[][] memberlist = new String[100][2];
		
		//3. 프로그램 실행 반복문
		while(true) { 
			 System.out.println("\n[[회원제 프로그램]]");
			 System.out.println("[[1.회원가입 2.로그인 3.종료 선택 :");
			 int ch = scanner.nextInt();
			 
			if(ch==1) {//회원가입				
				
				System.out.println("[[회원가입 페이지]]");
				System.out.println("[[----> 아이디: "); String id = scanner.next();
				System.out.println("[[----> 비밀번호: "); String password = scanner.next();
				   //중복체크
				boolean idcheck = true;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] !=null && memberlist[i][0].equals(id)) {
						// 기존회원에 아이디가 null 아니면서 앞전에 입력한 아이디와 동일하면
						System.out.println("[[실패]] 중복된 아이디가 존재합니다.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {	
					//회원가입처리 [배열에 빈공간을 찾아서 빈공간에 회원넣기]
					for(int i=0; i<memberlist.length; i++) {
						if(memberlist[i][0]==null) {
							memberlist[0][0]=id;
							memberlist[0][1]=password;
							System.out.println("[[완료]] : 회원가입이 되었습니다. ");
							break;
						}
					}					
					
				}
				
			}
			else if(ch==2) {//로그인				
				
				System.out.println("[[로그인 페이지]]");
				System.out.print("[[----> 아이디: "); String id = scanner.next();
				System.out.print("[[----> 비밀번호: "); String password = scanner.next();
				   //로그인처리
				boolean logincheck = true;
				for(int i=0; i<memberlist.length; i++) {					         
					
					if(memberlist[i][0] !=null && memberlist[i][0].equals(id) && memberlist[0][1].equals(password)) {
						//로그인성공
						System.out.println("[["+id+"]] : 로그인 성공");
						
						while(true) {//로그인시 무한루프 [종료조건 :로그아웃[3번]입력시
							System.out.println("\n[[회원제 프로그램]]");
							System.out.println("[[1.회원탈퇴 2.비밀번호변경 3.로그아웃 선택 :");
							int ch2 = scanner.nextInt();
							if(ch2==1) {//회원탈퇴
								
								// 탈퇴한 회원 뒤로 한칸씩 당기기
								//1. 로그인된 회원 [탈퇴회원]정보 지우기
								memberlist[i][0] = null;
								memberlist[i][1] = null;
								
								//2. 탈퇴회원 뒤로 한칸씩 당기기
								for (int j=i ; h<memberlist.length; j++) {
									if(memberlist[j+i][0] !=null) {//다음회원 여부 확인 
										memberlist[j][0] = memberlist[j+1][0]; //현재위치에 j에 다음회원 j+1 대입
										memberlist[j][1] = memberlist[j+1][1]; //현재위치에 j에 다음회원 j+1 대입	
										} else {// 다음 회원이 없으면
											memberlist[j][0] = null;
											memberlist[j][0] = null;
											break;							
											
										}
									}							
													
								
							}//if end
							else if (ch2==2) {}
							else if (ch2==3) {System.out.println("[[로그아웃]] 로그아웃 되었습니다.");break; }
							else {System.out.println("[알림] 알수없는 번호 입니다. ");}
						}
						break;
					}		
									
				}//for end
			// if(logincheck) System.out.println("로그인실패" 동일한 정보가 없습니다. );
				
			}
			else if(ch==3) {System.out.println("[[종료]] 이용해 주셔서 감사합니다. "); break;}
			else{System.out.println("[[알림]] 알수없는 번호 입니다. ");}
			 			
		}//while end
		 
	}

}
