package Day16;

public class 사람 {
	
	//필드
	private String 이름;	
	
	//생성자
	public 사람 (String 이름) {
	this.이름 = 이름;	
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	@Override
	public  String toString() {
		return this.이름;
	}
	
	
	//메소드 = get, set
	
	
	

}
