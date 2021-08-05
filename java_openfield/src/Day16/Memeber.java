package Day16;

public class Memeber<T> {
	
	private String membername;
	private T[] memberlist;
	
	public Memeber (String membername) {
		this.membername = membername;
		memberlist = (T[])new Object[10];
		
		
	}
	
	public void add(T t) {
		for(int i=0; i<memberlist.length; i++) {
			if(memberlist[i] = null) {
				memberlist[i] = t;
				return;
			}
		}
	}
	
	
}
