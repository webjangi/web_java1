package Day09;

public class Charcter {
	
	//1. 필드
	public String name;  //이름
	protected int lv;    //레벨
	int ex;      // 경험치
	private int power;  // 공격력
	
	//2. 생성자
	
	
	//3. 메소드
		// set, get메소드
	public  void setpower(int power) {
		this.power = power;
		
	}
	public int getpower() {
		return power;
		
	}
	
	public void setlv (int lv) {
		this.lv = lv;
		
	}

}
