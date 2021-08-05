package Day16;

public class Day16_1 {
	
	
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setobject ("사과");	
		
		String name1 = (String)box1.getobject();
		System.out.println(name1);
		
		
		box1.setobject(new  Apple());
		
		Apple apple = (Apple)box1.getobject();
		
	
	Box2<String> box2 = new Box2<>();
	box2.set제네릭객체 ("사과");
	String name2 = box2.get제네릭객체();
	System.out.println(name2);
	
	
	//3. 멀티 제네릭 	
	Product<Televison, String> product1 = new Product<>();
	product1.setKind(new Televison());
	product1.setModel("스마트텔레비전");
	
	System.out.println("제품1 : " + product1.getKind() + product1.getModel());
	
	Product<Car, String> product2 =  new Product<Car, String> ();
	
	product2.setKind(new Car());
	product2.setModel("디젤자동차");
	
	System.out.println("제품2 : " + product2.getKind() + product2.getModel());
	
	}	
	
}
