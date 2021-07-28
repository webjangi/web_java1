package Day10;

public class vip extends È¸¿ø{
	
	private String grade;
	
	public vip() {
	super();
	}

	public vip(String id, String password, String grade) {
		super(id, password);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public void info() {
		super.info();
	}

}
