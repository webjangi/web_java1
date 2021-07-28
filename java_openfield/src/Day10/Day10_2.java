package Day10;

public class Day10_2 {
	
	// 회원 클래스 상속받아 vip클래스, 관리자 클래스, 일반 클래스 
		// 슈퍼클래스 : 회원클래스
			// 필드 : 아이디, 비밀번호
			// 생성자
			// 메소드 : 회원정보 출력 메소드
		// 서브클래스 : vip, 관리자, 일반
			// vip : 회원등급
					//필드 : 회원등급
			// 관리자 : 관리자직급
				// 회원정보 메소드 오버라이딩
				// 메소드 : 회원정보 메소드 오바라이딩

	
	public static void main(String[] args) {
		
	회원 member = new 회원("jws", "1234");
	vip Vip = new vip("asd", "asd", "gold");
	admin adm = new admin("admin", "admin", "ceo");
			
			//슈퍼클래스로 배열
			회원[] member = new 회원[3];
			member[0] = member;
			member[1] = Vip;
			member[2] = adm;
			//서브클래스 배열 
		
			
		
	}

}
