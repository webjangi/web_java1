package Day10;

public class Day10_2 {
	
	// ȸ�� Ŭ���� ��ӹ޾� vipŬ����, ������ Ŭ����, �Ϲ� Ŭ���� 
		// ����Ŭ���� : ȸ��Ŭ����
			// �ʵ� : ���̵�, ��й�ȣ
			// ������
			// �޼ҵ� : ȸ������ ��� �޼ҵ�
		// ����Ŭ���� : vip, ������, �Ϲ�
			// vip : ȸ�����
					//�ʵ� : ȸ�����
			// ������ : ����������
				// ȸ������ �޼ҵ� �������̵�
				// �޼ҵ� : ȸ������ �޼ҵ� ���ٶ��̵�

	
	public static void main(String[] args) {
		
	ȸ�� member = new ȸ��("jws", "1234");
	vip Vip = new vip("asd", "asd", "gold");
	admin adm = new admin("admin", "admin", "ceo");
			
			//����Ŭ������ �迭
			ȸ��[] member = new ȸ��[3];
			member[0] = member;
			member[1] = Vip;
			member[2] = adm;
			//����Ŭ���� �迭 
		
			
		
	}

}