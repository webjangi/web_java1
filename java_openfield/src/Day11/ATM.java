package Day11;

public interface ATM {
	
		//�߻�޼ҵ�
		public void menu(); //�޴�
		public void create(); // ���µ��
		public void deposit(); // ���
		public void withdraw(); // ���
		public void transfer(); //��ü
		public void balance();  //�ܱ�
		
		public default void ����() {
			System.out.println("���� ����");		
			
		}
		

}