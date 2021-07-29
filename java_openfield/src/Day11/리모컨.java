package Day11;

	public interface 리모컨 {
		
		//멤버 :ㅣ상수, 추상메소드
		
		int 최대소음 = 10;
		int 최소소음 = 0;
		
		// 추상메소드 : 선언 o 정의 x
		public abstract void 실행();
		public void 종료();
		public void 소음설정 (int 소음);
		
		// default 메소드
		public default void 채널변경() {
			System.out.println("채널변경");
			
		}		
		
	}

