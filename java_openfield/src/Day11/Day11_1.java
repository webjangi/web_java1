package Day11;

public class Day11_1 {
	
	//인터페이스
		//목적 : 여러 클래스들이 동일한 목적하에 동일한 기능을 수행
	
	public static void main(String[] args) {
		
		// 
		
		리모컨 리모컨;
		
		리모컨 = new 텔레비전();
		리모컨.실행();
		리모컨.소음설정(5);
		리모컨.종료();
		
		리모컨 = new 오디오();
		리모컨.실행();
		리모컨.소음설정(15);
		리모컨.종료();
		
		리모컨 = new 스마트텔레비전 ();
		리모컨.실행();
		리모컨.소음설정(10);
		리모컨.종료();
		
	}

}
