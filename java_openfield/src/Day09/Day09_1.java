package Day09;

public class Day09_1 {
	
	// Ŭ����
		// ��� : �ʵ�, ������, �޼ҵ�
		// ���������� : 
			// public : �������� 
	
	public static void main(String[] args) {
		
		// ���Ӽ� ĳ���� == ��ü
		Charcter character = new Charcter();
		character.name = "������";
		character.lv = 1;
		character.ex = 0;
		
		
		character.setpower(10);
		System.out.println("���� ���ݷ� :" + character.getClass());
		
	}

}