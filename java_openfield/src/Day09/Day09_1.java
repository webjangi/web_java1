package Day09;

public class Day09_1 {
	
	// 클래스
		// 멤버 : 필드, 생성자, 메소드
		// 접근제한자 : 
			// public : 프로젝내 
	
	public static void main(String[] args) {
		
		// 게임속 캐릭터 == 객체
		Charcter character = new Charcter();
		character.name = "웹쟁이";
		character.lv = 1;
		character.ex = 0;
		
		
		character.setpower(10);
		System.out.println("현재 공격력 :" + character.getClass());
		
	}

}
