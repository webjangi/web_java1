package Day13;

import java.io.IOException;

public class Day13_3 {
		
	public static void main(String[] args) throws IOException  {
	
		String[] ������� = {
				"�ȴ�! ���̹� ���α�&����Ʈ", 
				"������ ��Ʈ ���� Ȱ�� ������", 
				"Tucker�� Go ��� ���α׷���", 
				"ȥ�� �����ϴ� C���"};
		
		byte[] ����Ʈ�迭 = new byte[100];
		System.out.print("�˻��� ������ : ");	
			System.in.read(����Ʈ�迭);
			String �˻��� = new String(����Ʈ�迭);
		
		// �˻��� �ش��ϴ� ���� ���
		for(int i=0; i<�������.length; i++) {					
			if(�������[i].indexOf(�˻���) != -1) {
				 System.out.println(�������[i]);
			}			
		}
		
		// ��ü
		System.out.println("��ü �ܾ� :");
		System.in.read(����Ʈ�迭);
		String ��ü�ܾ� = new String(����Ʈ�迭);		
		System.out.println("���ο� �ܾ� :");
		System.in.read(����Ʈ�迭);
		String ���ο�ܾ� = new String(����Ʈ�迭);
		
		for( int i=0; i<�������.length; i++) {
			if(�������[i].indexOf(�˻���) !=-1) {
				�������[i].replace(��ü�ܾ�, ���ο�ܾ�);
			}
		}
		
		//�˻��� �ش� �ϴ� ���� ���
		for(int i=0; i<�������.length; i++) {				
			if(�������[i].indexOf(�˻���) != -1) {
				 System.out.println(�������[i]);
			}
			
		}
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		537771
	}
}