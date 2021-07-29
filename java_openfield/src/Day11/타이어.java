package Day11;

public class 타이어 {
	
	//필드
	int 타이어수명;
	int 회전수;
	String 타이어위치;
	
	//생성자 [객체의 초기값]
	public 타이어 (String 타이어위치, int 타이어수명 ) {
		this.타이어수명 = 타이어수명;
		this.타이어위치 = 타이어위치;
	}
	
	//메소드
	public boolean 회전() {
		회전수++;
		if(회전수 < 타이어수명 ) {
			System.out.println(타이어위치+"타이어 수명" + (타이어수명-회전수) + "회 남음");
			return true;
		} else {
			System.out.println(타이어위치+ "타이어 펑크[교체바람]");
			return false;
		}
	
	}
	
}
