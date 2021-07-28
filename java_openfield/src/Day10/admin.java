package Day10;

public class admin extends È¸¿ø{
	
	private String position; 
	
	public admin() {
		super();
	}

	public admin(String id, String password, String position) {
		super(id, password);
		this.position = position;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("postion:" + position);
	}
	

}
