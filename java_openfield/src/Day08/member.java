package Day08;


public class member {
	
		
		//1. �ʵ� : ����[�޸�]
		String id;
		String name;
		int password;
		String email;
		
		//2. ������ [��ü����� �ʱⰪ]
		public member () {
			
		}
		
		public member(String id, String nickname, int password, String emial ) {
			this.id = id;
			this.name = name;
			this.password = password;
			this.email = emial;
			//this.��� : ����Ŭ������ ���	
				//������ �̸��� �������� ��� ���
		}
		
		public member (String id, int password) {
			this.id = id;
			this.password = password;
			
		}
		
		//3. �޼ҵ� : �Լ�
			//1. �޼ҵ� ����
		public void info () {
			//void : ��ȯ Ÿ�� ����
				// �޼ҵ��[����] : �ƹ��ų�
			 		//() : �μ��� ����
			System.out.println(id);
			
		}
		
		//
		public String getemail() {
			// ��ȯŸ�� string ��ȯ
			 // �μ� : X
			return email;
		}
		
		public String setname(String name) {
			this.name = name;
			return "�̸��� ���� �Ǿ����ϴ�. ";			
		}
		public void setemail(String email) {
			this.email = email;			
			
		}
	
}