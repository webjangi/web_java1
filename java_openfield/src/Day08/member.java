package Day08;


public class member {
	
		
		//1. 필드 : 상태[메모리]
		String id;
		String name;
		int password;
		String email;
		
		//2. 생성자 [객체선언시 초기값]
		public member () {
			
		}
		
		public member(String id, String nickname, int password, String emial ) {
			this.id = id;
			this.name = name;
			this.password = password;
			this.email = emial;
			//this.멤버 : 현재클래스의 멤버	
				//동일한 이름이 존재했을 경우 사용
		}
		
		public member (String id, int password) {
			this.id = id;
			this.password = password;
			
		}
		
		//3. 메소드 : 함수
			//1. 메소드 선언
		public void info () {
			//void : 반환 타입 없음
				// 메소드명[임의] : 아무거나
			 		//() : 인수가 없음
			System.out.println(id);
			
		}
		
		//
		public String getemail() {
			// 반환타입 string 반환
			 // 인수 : X
			return email;
		}
		
		public String setname(String name) {
			this.name = name;
			return "이름이 변경 되었습니다. ";			
		}
		public void setemail(String email) {
			this.email = email;			
			
		}
	
}
