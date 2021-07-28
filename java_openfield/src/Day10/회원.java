package Day10;

public class 회원 {
	
	private String id;
	private String password;
	
	public 회원() {
		
	}
	
	
	
	
	public 회원(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}




	public void info() {
		System.out.println("id : " +id);
		
	}


	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    

}
